package com.example.n56j.project1;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.HttpCookie;
import java.util.ArrayList;

public class ActivityRegister extends AppCompatActivity {

    private EditText  edtUser_name, edtEmail,edtPhone, edtPassword;

    private Button btnpo_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_register);



    }
}
