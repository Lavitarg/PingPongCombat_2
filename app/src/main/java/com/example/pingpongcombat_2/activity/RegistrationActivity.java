package com.example.pingpongcombat_2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pingpongcombat_2.R;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener  {
    private EditText etLoginRg;
    private EditText etPswrdRg;
    private EditText etPswrdCnRg;
    private EditText etEmailRg;
    private EditText etPincRg;
    private Button btnSUpRg;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etLoginRg= (EditText) findViewById(R.id.et_login_register);
        etPswrdRg= (EditText) findViewById(R.id.et_pswrd_register);
        etPswrdCnRg= (EditText) findViewById(R.id.et_pswrd_register);
        etEmailRg= (EditText) findViewById(R.id.et_email_register);
        etPincRg= (EditText) findViewById(R.id.et_pincode_register);
        btnSUpRg= (Button) findViewById(R.id.btn_sUp_register);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(RegistrationActivity.this,HomeActivity.class);
        startActivity(intent);

    }
}
