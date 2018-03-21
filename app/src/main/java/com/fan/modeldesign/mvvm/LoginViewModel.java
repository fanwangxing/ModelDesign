package com.fan.modeldesign.mvvm;

import android.content.Context;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.fan.modeldesign.mvp.API;
import com.fan.modeldesign.model.LoginBean;
import com.fan.modeldesign.model.LoginRequestBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by fan on 2017/8/21.
 */

public class LoginViewModel {
    private Context mContext;
    @NonNull
    public ObservableField<String> username = new ObservableField<>();
    @NonNull
    public ObservableField<String> password = new ObservableField<>();
    @NonNull
    public ObservableField<String> code = new ObservableField<>();
    @NonNull
    public ObservableField<String> status = new ObservableField<>();

    public LoginViewModel(Context context) {
        this.mContext = context;
    }

    /**
     * 登录接口请求
     */
    public void login() {
        if (validateInput()) {
            LoginRequestBean flyRouteBean = new LoginRequestBean();
            flyRouteBean = initdata(flyRouteBean);
            Gson gson = new Gson();
            String route = gson.toJson(flyRouteBean);

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

                    if (response.body().isSuccess()) {
                        status.set("登录成功");
                    } else {
                        status.set("登录失败");
                    }
                }

                @Override
                public void onFailure(Call<LoginBean> call, Throwable t) {
                    status.set("访问失败");
                }
            });
        }
    }

//     <!--admin-->
//    <!--123456abcD-->
//    <!--wc1141-->

    /**
     * 请求参数
     *
     * @param loginRequestBean
     * @return
     */
    @NonNull
    private LoginRequestBean initdata(@NonNull LoginRequestBean loginRequestBean) {
        // TODO Auto-generated method stub

        loginRequestBean.setUserNameOrEmailAddress(username.get());
        loginRequestBean.setPassword(password.get());
        loginRequestBean.setCode(code.get());
        return loginRequestBean;
    }

    /**
     * 密码校验
     *
     * @return
     */

    public boolean validateInput() {
        if (password.get().length() <= 0) {
            status.set("密码不能为空");
        } else {
            status.set(null);
        }
        return status.get() == null;
    }

}
