package com.fan.modeldesign.mvp.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.fan.modeldesign.R;
import com.fan.modeldesign.mvp.presenter.BasePresenter;
import com.fan.modeldesign.mvp.presenter.MvpLoginPresenter;

import butterknife.ButterKnife;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusActivity;

@RequiresPresenter(MvpLoginPresenter.class)
public abstract class BaseActivity<P extends BasePresenter> extends NucleusActivity<BasePresenter> {


    private LinearLayout root_layout;
    private View toolbar_layout;

    private TextView tv_left;
    private TextView tv_right;
    private TextView tv_title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 重点
        super.setContentView(R.layout.activity_base);

        initToolbar();
        setView();
        ButterKnife.bind(this);
        initView();
        setListener();
        initData();
    }
    protected abstract void setView();

    protected abstract void initView();

    protected abstract void setListener();

    protected abstract void initData();
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        setContentView(View.inflate(this, layoutResID, null));
    }

    @Override
    public void setContentView(View view) {
        root_layout = (LinearLayout) findViewById(R.id.root_layout);
        if (root_layout != null) {
            root_layout.addView(view, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            initToolbar();
        }
    }

    /**
     * 初始化 toolbar 内容布局
     */
    private void initToolbar() {
        tv_left = f(R.id.left_tv);
        tv_right = f(R.id.right_tv);
        tv_title = f(R.id.tv_title);
        toolbar_layout = f(R.id.ll_toolbar);
    }

    protected TextView setLeftImg(int image) {
        if (tv_left != null) {
            Drawable flag_drawable = getApplication().getResources().getDrawable(image);
            flag_drawable.setBounds(0,0,flag_drawable.getMinimumWidth(), flag_drawable.getMinimumHeight());
            tv_left.setCompoundDrawables(flag_drawable,null, null, null);
            tv_left.setVisibility(View.VISIBLE);
        }
        return tv_left;
    }
    protected TextView setLeftText(String text) {
        if (tv_left != null) {
            tv_left.setVisibility(View.VISIBLE);
            tv_left.setText(text);
        }
        return tv_right;
    }
    /**
     * 设置返回按钮
     */
    protected void setBack() {
        if (tv_left != null) {
            tv_left.setVisibility(View.VISIBLE);
            tv_left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    /**
     * 设置当前 Activity 标题
     *
     * @param title
     */
    protected void setTitle(String title) {
        if (tv_title != null) {
            tv_title.setVisibility(View.VISIBLE);
            tv_title.setText(title);
        }
    }
    protected TextView setRightImg(int image) {
        if (tv_right != null) {
            Drawable flag_drawable = getApplication().getResources().getDrawable(image);
            flag_drawable.setBounds(0,0,flag_drawable.getMinimumWidth(), flag_drawable.getMinimumHeight());
            tv_right.setCompoundDrawables(flag_drawable,null, null, null);
            tv_right.setVisibility(View.VISIBLE);
        }
        return tv_right;
    }
    protected TextView setRightText(String text) {
        if (tv_right != null) {
            tv_right.setVisibility(View.VISIBLE);
            tv_right.setText(text);
        }
        return tv_right;
    }

    /**
     * 隐藏头部标题栏
     */
    protected void hideToolbar() {
        if (toolbar_layout != null) {
            toolbar_layout.setVisibility(View.GONE);
        }
    }

    @NonNull
    protected <T extends View> T f(int id) {
        return (T) findViewById(id);
    }
}
