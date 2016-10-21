package com.example.n56j.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_admin);
    }
    public void buttom2onClick(View v) {
        Intent nextPage = new Intent(ActivityAdmin.this,ActivityRegisterAdmin.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttom3onClick(View v) {
        Intent nextPage = new Intent(ActivityAdmin.this,MainActivityAdmin.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }


}
