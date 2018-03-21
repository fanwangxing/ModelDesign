package com.fan.modeldesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fan.modeldesign.mvc.ui.MvcLoginActivity;
import com.fan.modeldesign.mvp.view.MvpLoginActivity;
import com.fan.modeldesign.mvvm.MVVMLoginActivity;
import com.fan.modeldesign.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mvcClick(View view) {
        startActivity(new Intent(this, MvcLoginActivity.class));
    }

    public void mvpClick(View view) {
        startActivity(new Intent(this, MvpLoginActivity.class));
    }

    public void mvvmClick(View view) {
        startActivity(new Intent(this, MVVMLoginActivity.class));
    }

}
