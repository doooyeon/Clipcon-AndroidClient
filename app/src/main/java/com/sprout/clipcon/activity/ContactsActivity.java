package com.sprout.clipcon.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sprout.clipcon.R;


/**
 * Created by Yongwon on 2017. 4. 17..
 */

public class ContactsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.contacts_toolbar);
        toolbar.setTitle("주소록");
        toolbar.setNavigationIcon(R.drawable.btn_title_back_white_n);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
