package com.gabrielsamojlo.dagger_212.ui;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.android.support.DaggerFragment;

/**
 * Created by lap10532-local on 31/03/2018.
 */

public abstract class BaseFragment extends DaggerFragment {
    public final String TAG = getClass().getSimpleName();


    @CallSuper
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @CallSuper
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        setupComponent();

        return view;
    }

    protected abstract int getLayoutId();

    protected abstract void setupComponent();
}

