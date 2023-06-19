package com.vaibhavmojidra.androidjavademo2dagger2injectinginterface;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SmartPhoneModule {

    @Binds
    abstract SmartPhone bindsSmartPhone(Iphone iphone);
}
