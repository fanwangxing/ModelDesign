package com.fan.modeldesign.mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.fan.modeldesign.R;
import com.fan.modeldesign.databinding.ActivityMvvmLoginBinding;
import com.fan.modeldesign.mvvm.LoginViewModel;

public class MVVMLoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private ActivityMvvmLoginBinding activityMvvmloginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm_login);
        activityMvvmloginBinding = ActivityMvvmLoginBinding.bind(((ViewGroup)this.findViewById(android.R.id.content)).getChildAt(0));
        loginViewModel =  new LoginViewModel(this);
        activityMvvmloginBinding.setData(loginViewModel);
        setDefaultValue();
    }

    private void setDefaultValue() {
        loginViewModel.username.set("admin");
        loginViewModel.password.set("123456abcD");
        loginViewModel.code.set("wc1141");
    }

    public void logInClicked(View view) {
        uiToModel();
        loginViewModel.login();

    }
    private void uiToModel() {
        loginViewModel.password.set(activityMvvmloginBinding.password.getText().toString());
        loginViewModel.username.set(activityMvvmloginBinding.username.getText().toString());
        loginViewModel.code.set(activityMvvmloginBinding.code.getText().toString());
        loginViewModel.status.set(activityMvvmloginBinding.status.getText().toString());

    }
}
