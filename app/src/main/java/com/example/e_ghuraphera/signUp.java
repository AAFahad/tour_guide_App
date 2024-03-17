package com.example.e_ghuraphera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class signUp extends AppCompatActivity implements View.OnClickListener {

    private EditText signUpName, signUpEmail, signUpPhone, signUpPassword;
    private Button signUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();

        signUpName = findViewById(R.id.editTextTextPersonName6);
        signUpEmail = findViewById(R.id.editTextTextEmailAddress4);
        signUpPassword = findViewById(R.id.editTextTextPassword6);
        signUpPhone = findViewById(R.id.editTextPhone4);
        signUp = findViewById(R.id.button5);

        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                userRegister();
        }

    }

    private void userRegister() {
        String name = signUpName.getText().toString().trim();
        String email = signUpEmail.getText().toString().trim();
        String password = signUpPassword.getText().toString().trim();
        String phone = signUpPhone.getText().toString().trim();

        //checking the validity of the email
        if (email.isEmpty()) {
            signUpEmail.setError("Enter an email address");
            signUpEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            signUpEmail.setError("Enter a valid email address");
            signUpEmail.requestFocus();
            return;
        }

        //checking the validity of the password
        if (password.isEmpty()) {
            signUpPassword.setError("Enter a password");
            signUpPassword.requestFocus();
            return;
        }
        if (password.length() < 6) {
            signUpPassword.setError("Length must 6 or more");
            signUpPassword.requestFocus();
            return;
        }


        reg(email, password);

    }

    // Firebase -> Database
    private void reg(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(signUp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(signUp.this, "Loading", Toast.LENGTH_SHORT).show();
                        if (task.isSuccessful()) {
                            Toast.makeText(signUp.this, "sign up success", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(signUp.this, MainActivity.class));
                        } else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                Toast.makeText(signUp.this, "This user already Registered", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(signUp.this, "Error :" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

    }
}