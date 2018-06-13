package com.example.banks.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class LetterPage extends AppCompatActivity {
    private ImageView imageView;
    /*public String[]  pictures = {"/Slide01","/Slide02","/Slide03","/Slide04",
                                "/Slide05","/Slide06","/Slide07","/Slide08",
                                "/Slide09","/Slide10","/Slide11","/Slide12",
                                "/Slide13","/Slide14","/Slide15","/Slide16",
                                "/Slide17","/Slide18","/slide19","/Slide20",
                                "/Slide21","/Slide22","/Slide23","/Slide24",
                                "/Slide25","/Slide26"};*/
    private Bitmap[] bmpArray = new Bitmap[26];
    private Button home,back,next,overview,lastpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_page);
        final String[] m = {getIntent().getStringExtra("mholi")};
        setBitmap();

        //imageView = (ImageView)findViewById(R.id.imageView);
        //imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));

        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m[0] = 0+"";
                imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));
            }
        });

        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int backVal = Integer.parseInt(m[0]) - 1;
                if(backVal == -1){
                    backVal = 25;
                }
                m[0] = backVal+"";
                imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));

            }
        });

        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextVal = Integer.parseInt(m[0]) + 1;
                if(nextVal == 26){
                    nextVal = 0;
                }
                m[0] = nextVal+"";
                imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));
            }
        });
        lastpage = (Button)findViewById(R.id.lastpage);
        lastpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m[0] = 25+"";
                imageView.setImageDrawable(new BitmapDrawable(getResources(),(Bitmap)(bmpArray[Integer.parseInt(m[0])])));
            }
        });
        overview = (Button)findViewById(R.id.overview);
        overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void setBitmap(){
        File f;
        Bitmap bmp;
        for(int i = 1; i<27; i++){

          if(i<10) {
                f = new File(getExternalFilesDirs(Environment.DIRECTORY_DCIM)[1].getAbsolutePath() +"/Slide0"+i+".gif");
            }
            else{
                f = new File(getExternalFilesDirs(Environment.DIRECTORY_DCIM)[1].getAbsolutePath()+"/Slide"+i+".gif");
            }
                bmp = BitmapFactory.decodeFile(f.getAbsolutePath());
                bmpArray[i-1] = bmp;

        }

    }
}
