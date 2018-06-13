package com.example.banks.myapplication;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    public Button[] buttons;
    //public int tt = 1;
    public void buttonClicked(){
         buttons = new Button[]{(Button)findViewById(R.id.a),(Button)findViewById(R.id.b),(Button)findViewById(R.id.c),
                                (Button)findViewById(R.id.d),(Button)findViewById(R.id.e), (Button)findViewById(R.id.f),
                                (Button)findViewById(R.id.g),(Button)findViewById(R.id.h),(Button)findViewById(R.id.i),
                                (Button)findViewById(R.id.j),(Button)findViewById(R.id.k),(Button)findViewById(R.id.l),
                                (Button)findViewById(R.id.m),(Button)findViewById(R.id.n),(Button)findViewById(R.id.o),
                                (Button)findViewById(R.id.p),(Button)findViewById(R.id.q),(Button)findViewById(R.id.r),
                                (Button)findViewById(R.id.s),(Button)findViewById(R.id.t),(Button)findViewById(R.id.u),
                                (Button)findViewById(R.id.v),(Button)findViewById(R.id.w),(Button)findViewById(R.id.x),
                                (Button)findViewById(R.id.y),(Button)findViewById(R.id.z)};
        for(int i = 0; i<buttons.length; i ++){
            final int buttonCount = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent t1 = new Intent(MainActivity.this,LetterPage.class);
                    t1.putExtra("mholi",buttonCount+"");
                    startActivity(t1);
                }
            });
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClicked();
    }
}
