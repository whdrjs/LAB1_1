package com.example.lab1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imgBoolean=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
    }
    public void onButtonClicked(View v){
        changeImage();
    }
    private void changeImage(){
        if(imgBoolean == 0){
            imgBoolean = 1;
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }
        else if (imgBoolean== 1){
            imgBoolean = 0;
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

        }
    }
}
