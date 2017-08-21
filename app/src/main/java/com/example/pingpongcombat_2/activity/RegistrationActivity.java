package com.example.pingpongcombat_2.activity;

import android.app.Activity;
import android.content.Intent;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pingpongcombat_2.R;
import com.example.pingpongcombat_2.RetainFragment;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener  {
    private EditText etLoginRg;
    private EditText etPswrdRg;
    private EditText etPswrdCnRg;
    private EditText etEmailRg;
    private EditText etPincRg;
    private Button btnSUpRg;
    private RetainFragment retainFragment;
    private static final String RRFRAGMENT = "registrationRetainFragment";
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
        btnSUpRg.setOnClickListener(this);
        FragmentManager fragmentManager= getFragmentManager();
        retainFragment = (RetainFragment) fragmentManager.findFragmentByTag(RRFRAGMENT);

        if (retainFragment == null) {
            retainFragment = new RetainFragment();
            fragmentManager.beginTransaction().add(retainFragment, RRFRAGMENT).commit();
        }
        setData();

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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String login = etLoginRg.getText().toString();
        String pswrd = etPswrdRg.getText().toString();
        String cfpswrd = etPswrdCnRg.getText().toString();
        String email = etEmailRg.getText().toString();
        String pincode = etPincRg.getText().toString();
        retainFragment.saveData(login,pswrd,cfpswrd,email,pincode);
    }
    private void setData(){
        Bundle bundle = retainFragment.getData();
        etLoginRg.setText(bundle.getString("login"));
        etPswrdRg.setText(bundle.getString("password"));
        etPswrdCnRg.setText(bundle.getString("confirmPassword"));
        etEmailRg.setText(bundle.getString("email"));
        etPincRg.setText(bundle.getString("pincode"));
    }
}
