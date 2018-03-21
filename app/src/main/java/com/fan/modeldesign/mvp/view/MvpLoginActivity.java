package com.fan.modeldesign.mvp.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fan.modeldesign.R;
import com.fan.modeldesign.model.LoginBean;
import com.fan.modeldesign.mvp.presenter.MvpLoginPresenter;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import nucleus.factory.RequiresPresenter;
import retrofit2.Response;

@RequiresPresenter(MvpLoginPresenter.class)
public class MvpLoginActivity extends BaseActivity<MvpLoginPresenter> {


    @Nullable
    @BindView(R.id.mvp_login) Button mvp_login;
    @Nullable
    @BindViews({R.id.mvp_username,R.id.mvp_password,R.id.mvp_code}) EditText []ets;
    @Nullable
    @BindView(R.id.mvp_status) TextView mvp_status;


    @Override
    protected void setView() {
        setContentView(R.layout.activity_mvp_login);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initData() {

    }

    public void onResponse(@NonNull Response<LoginBean> Response) {
        if (Response.body().isSuccess()) {
            mvp_status.setText("登录成功");
        } else {
            mvp_status.setText("登录失败");
        }
    }

    public void onFailure(Throwable throwable) {
        mvp_status.setText("访问失败");
    }

    @OnClick(R.id.mvp_login)
    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.mvp_login:
                ((MvpLoginPresenter) getPresenter()).login(ets[0].getText().toString(), ets[1].getText().toString(), ets[2].getText().toString());
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
