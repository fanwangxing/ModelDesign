package com.fan.modeldesign.mvc.ui;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.fan.modeldesign.R;
import com.fan.modeldesign.mvp.view.BaseActivity;


public class MvcLoginActivity extends BaseActivity implements View.OnClickListener {
    private Button login_bt;
    private EditText usernameEt, passwordEt, codeEt;
    private TextView status;
    private String username,password,projectcode;


    @NonNull
    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    status.setText("登录失败");
                    break;
                case 1:
                    status.setText("登录成功");
                    break;
            }
        }
    };

    @Override
    protected void setView() {
        setContentView(R.layout.activity_mvp_login);
    }

    @Override
    protected void initView() {
        hideToolbar();
        login_bt = (Button) findViewById(R.id.mvp_login);
        usernameEt = (EditText) findViewById(R.id.mvp_username);
        passwordEt = (EditText) findViewById(R.id.mvp_password);
        codeEt = (EditText) findViewById(R.id.mvp_code);
        status = (TextView) findViewById(R.id.mvp_status);

    }


    @Override
    protected void setListener() {
        login_bt.setOnClickListener(this);
    }

    @Override
    protected void initData() {
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.mvp_login:
                password =  passwordEt.getText().toString();
                username = usernameEt.getText().toString();
                projectcode = codeEt.getText().toString();
//                HttpManager.getInstance(MvcLoginActivity.this).login(username, password,projectcode , handler);
                break;
        }
    }


}
