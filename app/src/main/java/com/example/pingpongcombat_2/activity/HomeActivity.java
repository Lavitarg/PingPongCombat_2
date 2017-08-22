package com.example.pingpongcombat_2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pingpongcombat_2.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TEST_TAG = "test";

    private Button btnSIn;
    private Button btnSUp;
    private EditText etLogin;
    private EditText etPswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnSIn = (Button) findViewById(R.id.btn_sIn);
        btnSUp = (Button) findViewById(R.id.btn_sUp);
        btnSIn.setOnClickListener(this);
        btnSUp.setOnClickListener(this);

        etLogin = (EditText) findViewById(R.id.et_login_home);
        etPswrd = (EditText) findViewById(R.id.et_pswrd_Home);

        if (savedInstanceState != null){
            setData(savedInstanceState);
        }
    }

    private void setData(Bundle bundle) {
        etLogin.setText(bundle.getString("login"));
        etPswrd.setText(bundle.getString("password"));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String login = etLogin.getText().toString();
        String password = etPswrd.getText().toString();

        outState.putString("login", login);
        outState.putString("password", password);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Log.d(TEST_TAG,"in on click");
        switch (v.getId()) {
            case R.id.btn_sIn:
                Intent intent1 = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_sUp:
                Intent intent2 = new Intent(HomeActivity.this, RegistrationActivity.class);
                startActivity(intent2);
                break;
        }

    }
}
