package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Menu menu = bottomNavigationView.getMenu();
                menu.findItem(R.id.action_home).setIcon(R.drawable.instagram_home_outline_24);
                menu.findItem(R.id.action_compose).setIcon(R.drawable.instagram_new_post_outline_24);
                menu.findItem(R.id.action_profile).setIcon(R.drawable.instagram_user_outline_24);

                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.action_home:
                        item.setIcon(R.drawable.instagram_home_filled_24);
                        break;
                    case R.id.action_compose:
                        item.setIcon(R.drawable.instagram_new_post_filled_24);
                        break;
                    case R.id.action_profile:
                        item.setIcon(R.drawable.instagram_user_filled_24);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}