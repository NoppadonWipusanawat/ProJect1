package com.example.n56j.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttomonClick(View v) {
        Intent nextPage = new Intent(MainActivity.this,ActivityRegister.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttom1onClick(View v) {
        Intent nextPage = new Intent(MainActivity.this,ActivityAdmin.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttom8onClick(View v) {
        Intent nextPage = new Intent(MainActivity.this,MainActivityUser.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }


}
