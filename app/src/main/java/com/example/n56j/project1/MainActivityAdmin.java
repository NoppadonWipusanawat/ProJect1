package com.example.n56j.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_admin);
    }
    public void buttom4onClick(View v) {
        Intent nextPage = new Intent(MainActivityAdmin.this,ActivityBuild.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttom5onClick(View v) {
        Intent nextPage = new Intent(MainActivityAdmin.this,ActivityShop.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttom6onClick(View v) {
        Intent nextPage = new Intent(MainActivityAdmin.this,ActivityDorm.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }

}
