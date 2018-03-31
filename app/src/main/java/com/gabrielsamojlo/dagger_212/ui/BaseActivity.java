package com.gabrielsamojlo.dagger_212.ui;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.gabrielsamojlo.dagger_212.R;

/**
 * Created by lap10532-local on 31/03/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @CallSuper
    @Override
    protected void onStart() {
        super.onStart();
    }

    @CallSuper
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_toolbar);
        if (savedInstanceState == null) {
            hostFragment(getFragmentToHost(getIntent().getExtras()));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }

    protected void hostFragment(BaseFragment fragment, int id) {
        if (fragment != null && getFragmentManager().findFragmentByTag(fragment.getTag()) == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(id, fragment, fragment.TAG);
            ft.commit();
        }
    }

    public void hostFragment(BaseFragment fragment) {
        hostFragment(fragment, R.id.fragment_container);
    }

    protected abstract BaseFragment getFragmentToHost(Bundle bundle);
}
