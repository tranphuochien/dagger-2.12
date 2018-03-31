package com.gabrielsamojlo.dagger_212.ui;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.gabrielsamojlo.dagger_212.DummyDependency;
import com.gabrielsamojlo.dagger_212.R;

import javax.inject.Inject;

/**
 * Created by lap10532-local on 31/03/2018.
 */

public class MainFragment extends BaseFragment {

    @Inject
    Application app;

    @Inject
    DummyDependency dummyDependency;

    public static BaseFragment newInstance(Bundle args) {
        BaseFragment fragment = new MainFragment();
        if (args != null) {
            fragment.setArguments(args);
        }
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(dummyDependency.getVerifyText());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void setupComponent() {

    }
}
