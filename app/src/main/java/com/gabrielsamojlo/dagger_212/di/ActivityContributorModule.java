package com.gabrielsamojlo.dagger_212.di;

import com.gabrielsamojlo.dagger_212.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityContributorModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
