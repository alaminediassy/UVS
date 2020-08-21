package com.uvs.uvs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName, passWord;
    private Button btnLogin;
    private TextView message;
    private final String elogin = "android";
    private final String epassWord = "android";
    private final String first = "Saisissez le login et le mot de passe";
    private final String second = "Login ou Mot de passe incorrect";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.login);
        passWord = findViewById(R.id.passWord);
        btnLogin = findViewById(R.id.btnLogin);
        message =  findViewById(R.id.messageErreur);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputLogin = userName.getText().toString();
                String inputPassword = passWord.getText().toString();
                String msgErreur = message.getText().toString();
                //Toast.makeText(MainActivity.this, "Saisissez le login et le mot de passe", Toast.LENGTH_SHORT).show();
                if(inputLogin.isEmpty() && inputPassword.isEmpty()){
                    message.setText(first);
                }

                else{
                    if(inputLogin.equals(elogin) && inputPassword.equals(epassWord)){
                        Intent intent = new Intent(MainActivity.this, MonProfil.class);
                        startActivity(intent);
                    }
                    else{
                        message.setText(second);
                        //Toast.makeText(MainActivity.this, "Login ou Mot de passe incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}