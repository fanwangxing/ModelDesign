package com.fan.modeldesign.mvp;



import android.support.annotation.NonNull;

import com.fan.modeldesign.model.LoginBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface API {
   public static final String APP_HOST_URL = "http://app.smo-clinplus.com/";
//   @Headers({"Content-Type: application/json","Accept: application/json"})
   @NonNull
   @POST("api/TokenAuth/Authenticate")
   Call<LoginBean> postFlyRoute(@Body RequestBody route);
}
