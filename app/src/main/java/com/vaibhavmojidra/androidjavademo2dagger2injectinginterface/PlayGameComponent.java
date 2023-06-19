package com.vaibhavmojidra.androidjavademo2dagger2injectinginterface;

import dagger.Component;
import dagger.Provides;

@Component(modules = {SmartPhoneModule.class})
public interface PlayGameComponent {
    PlayGame getPlayGame();
}
