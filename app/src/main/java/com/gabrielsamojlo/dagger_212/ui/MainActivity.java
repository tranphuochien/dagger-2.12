package com.gabrielsamojlo.dagger_212.ui;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected BaseFragment getFragmentToHost(Bundle bundle) {
        return MainFragment.newInstance(bundle);
    }

}
