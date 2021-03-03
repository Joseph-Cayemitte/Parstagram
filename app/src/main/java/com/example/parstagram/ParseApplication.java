package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("P0F4U0ElNIQSpkEcrxOi572TOocUx8vZsvNESlhy")
                .clientKey("dJP5x4YgHCwfbfGnbmqTh6YmQfiG3MhktasxNwRY")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
