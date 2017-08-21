package com.example.pingpongcombat_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;

/**
 * Created by Ruslanio on 21.08.2017.
 */

public class RetainFragment extends Fragment {

    private Bundle data;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);
    }

    public void saveData(String login, String password, String confirmPassword, String email, String pincode) {
        data = new Bundle();
        data.putString("login", login);
        data.putString("password", password);
        data.putString("confirmPassword", confirmPassword);
        data.putString("email", email);
        data.putString("pincode", pincode);
    }

    public Bundle getData() {
        if (data == null) {
            data = new Bundle();
        }
        return data;
    }


}
