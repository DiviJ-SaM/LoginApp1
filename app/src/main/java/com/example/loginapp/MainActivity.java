package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Login(View view) {
        Button button = findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);
        Button button3 = findViewById(R.id.button3);
        button3.setVisibility(View.VISIBLE);
        Button button4 = findViewById(R.id.button4);
        button4.setVisibility(View.INVISIBLE);
        Button button5 = findViewById(R.id.button5);
        button5.setVisibility(View.VISIBLE);

        TextView login_username = findViewById(R.id.textView3);
        login_username.setVisibility(View.VISIBLE);

        EditText Username = findViewById(R.id.editText2);
        Username.setText("");
        Username.setVisibility(View.VISIBLE);

        TextView login_password = findViewById(R.id.textView4);
        login_password.setVisibility(View.VISIBLE);

        EditText password = findViewById(R.id.editText3);
       password.setText("");
        password.setVisibility(View.VISIBLE);

        Button button2 = findViewById(R.id.button2);
        button2.setVisibility(View.INVISIBLE);


    }

    public void FinishLogin(View view) {
        EditText Username = findViewById(R.id.editText2);
        EditText password = findViewById(R.id.editText3);

        if (Username.length() == 0) {
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
        }
        if (password.length() == 0) {
            Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
        }

            Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_SHORT).show();


    }

    public void SignUp(View view) {
        Button button = findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);
        Button button3 = findViewById(R.id.button3);
        button3.setVisibility(View.INVISIBLE);
        Button button4 = findViewById(R.id.button4);
        button4.setVisibility(View.VISIBLE);
        Button button5 = findViewById(R.id.button5);
        button5.setVisibility(View.VISIBLE);




        TextView login_username = findViewById(R.id.textView3);
        login_username.setVisibility(View.VISIBLE);

        EditText Username = findViewById(R.id.editText2);
       Username.setText("");
        Username.setVisibility(View.VISIBLE);

        TextView login_password = findViewById(R.id.textView4);
        login_password.setVisibility(View.VISIBLE);

        EditText password = findViewById(R.id.editText3);
        password.setText("");
        password.setVisibility(View.VISIBLE);

        Button button2 = findViewById(R.id.button2);
        button2.setVisibility(View.INVISIBLE);

        EditText email = findViewById(R.id.editText4);
        email.setVisibility(View.VISIBLE);

    }

    public void FinishSignup(View view) {
        EditText Username = findViewById(R.id.editText2);
        EditText password = findViewById(R.id.editText3);
        EditText email = findViewById(R.id.editText4);
        if (Username.length() == 0) {
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
        }
        if (password.length() == 0) {
            Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
        }
            if (email.length() == 0) {
                Toast.makeText(this, "Please Enter Your Email-Id", Toast.LENGTH_SHORT).show();
            }

                Toast.makeText(this, "Account created", Toast.LENGTH_SHORT).show();

        }

        public void returnScreen(View view){
            Button button = findViewById(R.id.button);
            button.setVisibility(View.VISIBLE);
            Button button3 = findViewById(R.id.button3);
            button3.setVisibility(View.INVISIBLE);
            Button button4 = findViewById(R.id.button4);
            button4.setVisibility(View.INVISIBLE);
            Button button5 = findViewById(R.id.button5);
            button5.setVisibility(View.INVISIBLE);

            TextView login_username = findViewById(R.id.textView3);
            login_username.setVisibility(View.INVISIBLE);

            EditText Username = findViewById(R.id.editText2);
            Username.setVisibility(View.INVISIBLE);

            EditText email= findViewById(R.id.editText4);
            email.setVisibility(View.INVISIBLE);

            TextView login_password = findViewById(R.id.textView4);
            login_password.setVisibility(View.INVISIBLE);

            EditText password = findViewById(R.id.editText3);
            password.setVisibility(View.INVISIBLE);

            Button button2 = findViewById(R.id.button2);
            button2.setVisibility(View.VISIBLE);
        }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }

