package com.fan.modeldesign.mvp.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.fan.modeldesign.model.LoginBean;
import com.fan.modeldesign.model.LoginRequestBean;
import com.fan.modeldesign.mvp.API;
import com.fan.modeldesign.mvp.view.MvpLoginActivity;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MvpLoginPresenter extends BasePresenter<MvpLoginActivity> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

    }

    public void login(String username, String password, String code) {
        LoginRequestBean loginRequestBean = new LoginRequestBean();
        loginRequestBean = initdata(username, password, code, loginRequestBean);
        Gson gson = new Gson();
        String route = gson.toJson(loginRequestBean);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.APP_HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API postRoute = retrofit.create(API.class);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), route);
        Call<LoginBean> call = postRoute.postFlyRoute(body);
        call.enqueue(new Callback<LoginBean>() {
            @Override
            public void onResponse(Call<LoginBean> call, @NonNull Response<LoginBean> response) {
                ((MvpLoginActivity) getView()).onResponse(response);
            }

            @Override
            public void onFailure(Call<LoginBean> call, Throwable t) {
                ((MvpLoginActivity) getView()).onFailure(t);
            }
        });


    }
//      <!--admin-->
//    <!--123456abcD-->
//    <!--wc1141-->

    /**
     * 初始化参数
     *
     * @param loginRequestBean
     * @return
     */
    @NonNull
    private LoginRequestBean initdata(String username, String password, String code, @NonNull LoginRequestBean loginRequestBean) {
        // TODO Auto-generated method stub
        loginRequestBean.setUserNameOrEmailAddress(username);
        loginRequestBean.setPassword(password);
        loginRequestBean.setCode(code);
        return loginRequestBean;
    }
}
