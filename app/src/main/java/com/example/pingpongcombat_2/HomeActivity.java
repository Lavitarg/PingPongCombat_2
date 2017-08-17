package com.example.pingpongcombat_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnSIn;
    private Button btnSUp;
    private EditText etLogin;
    private EditText etPswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnSIn= (Button) findViewById(R.id.btn_sIn);
        btnSUp= (Button) findViewById(R.id.btn_sUp);
        etLogin= (EditText) findViewById(R.id.et_login_home);
        etPswrd= (EditText) findViewById(R.id.et_pswrd_Home);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sIn:break;
            case R.id.btn_sUp:
                Intent intent=new Intent(HomeActivity.this,RegistrationActivity.class);
                startActivity(intent);
                break;
        }

    }
}
