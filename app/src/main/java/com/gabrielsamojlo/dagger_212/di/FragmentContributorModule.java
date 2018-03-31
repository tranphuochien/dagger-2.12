package com.gabrielsamojlo.dagger_212.di;

import com.gabrielsamojlo.dagger_212.ui.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by lap10532-local on 31/03/2018.
 */

@Module
public abstract class FragmentContributorModule {

    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragment();

}

