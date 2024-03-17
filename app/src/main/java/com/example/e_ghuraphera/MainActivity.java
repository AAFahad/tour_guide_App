package com.example.e_ghuraphera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText signInEmail, signInPassword;
    private TextView signUpTextView;
    private Button signIn;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInEmail = findViewById(R.id.editTextTextPersonName);
        signInPassword = findViewById(R.id.editTextTextPassword);
        signIn = findViewById(R.id.button2);
        signUpTextView = findViewById(R.id.textView3);

        mAuth = FirebaseAuth.getInstance();

        signIn.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                loginForm();

                break;
            case R.id.textView3:
                Intent intent = new Intent(getApplicationContext(), signUp.class);
                startActivity(intent);
                break;
        }
    }

    private void loginForm() {
        String email = signInEmail.getText().toString().trim();
        String password = signInPassword.getText().toString().trim();

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    //if(user.isEmailVerified()){
                    Toast.makeText(MainActivity.this, "sign in success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, system_navigation.class));
                    // }
                    // else{
                    //      Toast.makeText(SignIn.this,"enter a valid email",Toast.LENGTH_SHORT).show();
                    //}
                } else {
                    Toast.makeText(MainActivity.this, "Error :" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
