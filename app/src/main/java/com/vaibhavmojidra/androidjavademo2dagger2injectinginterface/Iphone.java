package com.vaibhavmojidra.androidjavademo2dagger2injectinginterface;

import android.util.Log;

import javax.inject.Inject;

public class Iphone implements SmartPhone{
    @Inject
    public Iphone() {
    }

    @Override
    public void isSmartPhoneAvailable() {
        Log.i("MyTag","SmartPhone is available");
    }

    @Override
    public void getSmartPhoneBrand() {
        Log.i("MyTag","SmartPhone's brand is apple");
    }
}
