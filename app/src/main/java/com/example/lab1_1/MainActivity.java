package com.example.lab1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imgBoolean=0;       //check image has changed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //match android widget
        imageView=(ImageView)findViewById(R.id.imageView1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
    }
    //when button(id:button) is clicked, operation
    public void onButtonClicked(View v){
        changeImage();
    }
    //changed image
    private void changeImage(){
        if(imgBoolean == 0){
            imgBoolean = 1;
            imageView.setVisibility(View.INVISIBLE);    //hide imageView1
            imageView2.setVisibility(View.VISIBLE);     //show imageView2
        }
        else if (imgBoolean== 1){
            imgBoolean = 0;
            imageView.setVisibility(View.VISIBLE);      //show imageView1
            imageView2.setVisibility(View.INVISIBLE);   //hide imageView2

        }
    }
}
