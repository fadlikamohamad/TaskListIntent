package com.example.myintent.modul.login;

import android.view.View;
import com.example.myintent.base.BaseFragmentHolderActivity;

public class LoginActivity extends BaseFragmentHolderActivity {

    LoginFragment loginFragment;

    @Override
    protected void initializeFragment() {
        initializeView();
        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);
        loginFragment = new LoginFragment();
        setCurrentFragment(loginFragment, false);
    }

}