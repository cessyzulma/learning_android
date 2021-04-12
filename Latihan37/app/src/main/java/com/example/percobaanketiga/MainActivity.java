package com.example.percobaanketiga;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)  findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("nurul.cessy")&& passwordKey.equals("123")){
                    // Jika Login Berhasil
                    Toast.makeText(getApplicationContext(),"LOGIN SUKSES",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    // Jika Login Tidak Berhasil
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda Salah").setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
