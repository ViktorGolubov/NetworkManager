package com.example.networkmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSample = findViewById(R.id.activity_main__image__sample);

        final Button btnImage = findViewById(R.id.activity_main__btn__fetch);
        btnImage.setOnClickListener(this);

        final  Button btnData = findViewById(R.id.activity_main__btn__get_data);
        btnData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main__btn__fetch:
                break;
            case R.id.activity_main__btn__get_data:
                break;
            default:
                    Log.w("", "clickable view not");
        }
    }
}
