package com.fan.modeldesign.mvc.http

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Handler


import com.google.gson.Gson
import com.loopj.android.http.JsonHttpResponseHandler
import com.fan.modeldesign.model.LoginBean
import com.fan.modeldesign.MyApplication

import org.json.JSONException
import org.json.JSONObject

import java.io.UnsupportedEncodingException

import cz.msebera.android.httpclient.Header
import cz.msebera.android.httpclient.entity.ByteArrayEntity
import cz.msebera.android.httpclient.message.BasicHeader
import cz.msebera.android.httpclient.protocol.HTTP

class HttpManager private constructor(private val mContext: Context) {
//    enum class LoginStatus {
//        NotLogin,
//        OnLogin,
//        HasLogin
//    }
//
//
//    var loginStatus: LoginStatus
//
//    private val editor: SharedPreferences.Editor? = null
//    private val preferences: SharedPreferences
//    private val myApplication: MyApplication
//
//    init {
//        myApplication = (mContext as Activity).application as MyApplication
//        preferences = mContext.getSharedPreferences("userInfo", Context.MODE_PRIVATE)
//        loginStatus = LoginStatus.NotLogin
//    }
//
//    //自动登录
//    fun autoLogin(force: Boolean): Boolean {
//        if (force || loginStatus == LoginStatus.NotLogin) {
//            val username = preferences.getString(HttpClient.HttpKey.UserName, "")
//            val password = preferences.getString(HttpClient.HttpKey.Password, "")
//            val code = preferences.getString(HttpClient.HttpKey.Code, "")
//            if (username!!.length > 0 && password!!.length > 0) {
//                login(username, password, code, null!!)
//                return true
//            }
//        }
//        return false
//    }
//
//    /**
//     * 登录
//
//     * @param username
//     * *
//     * @param password
//     * *
//     * @param code
//     * *
//     * @param handler
//     */
//    fun login(username: String, password: String, code: String, handler: Handler) {
//        val jsonObject = JSONObject()
//        try {
//            jsonObject.put(HttpClient.HttpKey.UserName, username)
//            jsonObject.put(HttpClient.HttpKey.Password, password)
//            jsonObject.put(HttpClient.HttpKey.Code, code)
//        } catch (e: JSONException) {
//            e.printStackTrace()
//        }
//
//        var entity: ByteArrayEntity? = null
//        try {
//            entity = ByteArrayEntity(jsonObject.toString().toByteArray(charset("UTF-8")))
//            entity.contentType = BasicHeader(HTTP.CONTENT_TYPE, "application/json")
//        } catch (e: UnsupportedEncodingException) {
//            e.printStackTrace()
//        }
//
//        HttpClient.getInstance().post(mContext, HttpUrl.LOGIN_URL, entity, "application/json", object : JsonHttpResponseHandler() {
//
//            override fun onSuccess(statusCode: Int, headers: Array<Header>?, response: JSONObject) {
//                super.onSuccess(statusCode, headers, response)
//                val gson = Gson()
//                val loginBean = gson.fromJson<LoginBean>(response.toString(),LoginBean::class.java)
//                if (loginBean.isSuccess) {
//                    handler.sendEmptyMessage(1)
//                } else {
//                    handler.sendEmptyMessage(0)
//                }
//            }
//
//            override fun onFailure(statusCode: Int, headers: Array<Header>?, throwable: Throwable, errorResponse: JSONObject?) {
//                super.onFailure(statusCode, headers, throwable, errorResponse)
//                handler.sendEmptyMessage(0)
//            }
//        })
//    }
//
//    companion object {
//
//        private var instance: HttpManager? = null
//
//        fun getInstance(context: Context): HttpManager {
//            if (instance == null) {
//                instance = HttpManager(context)
//            }
//            return instance
//        }
//    }


}
