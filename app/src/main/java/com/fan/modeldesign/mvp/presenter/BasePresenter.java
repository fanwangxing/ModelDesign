package com.fan.modeldesign.mvp.presenter;

import android.os.Bundle;

import com.fan.modeldesign.mvp.view.BaseActivity;

import nucleus.presenter.RxPresenter;
import nucleus.view.NucleusActivity;


public class BasePresenter<V extends NucleusActivity> extends RxPresenter<BaseActivity> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

    }
}
