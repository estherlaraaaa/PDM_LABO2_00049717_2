package com.example.galery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int[] pics = {R.drawable.pic1, R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9};
        int viewId = v.getId();
        Log.i("id ", viewId+"");
        switch (viewId){
            case R.id.img1:
                img1.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img2:
                img2.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img3:
                img3.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img4:
                img4.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img5:
                img5.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img6:
                img6.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img7:
                img7.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img8:
                img8.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img9:
                img9.setImageResource(pics[(int) Math.floor(Math.random() * 9)]);
                break;

        }

    }
}

