package com.example.n56j.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_user);
    }
    public void buttom7onClick(View v) {
        Intent nextPage = new Intent(MainActivityUser.this,MapsActivity.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
}
