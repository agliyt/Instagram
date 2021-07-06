package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5rJ2OeJaKPJmKabOWuk6t5VFoML5zdM3Oid5IaXw")
                .clientKey("22fRilvk3M7waMpa0sc4JrDFChR3qAtGkBFUDnvt")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
