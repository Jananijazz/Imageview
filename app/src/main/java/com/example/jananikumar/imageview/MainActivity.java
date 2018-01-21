package com.example.jananikumar.imageview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5;
    private String some=MainActivity.class.getSimpleName();
//    private  TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=(ImageView)findViewById(R.id.snacks);
        imageView2=(ImageView)findViewById(R.id.meat);
        imageView3=(ImageView)findViewById(R.id.cosmetics);
        imageView4=(ImageView)findViewById(R.id.electronics);
        imageView5=(ImageView)findViewById(R.id.gift);

//         tableLayout = (TableLayout) findViewById(R.id.table_layout);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        if(id==R.id.snacks)
        {
            Fragment fragment = new SecondFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contanere, fragment);
            transaction.commit();


        }
        if(id==R.id.meat){
            Fragment fragment = new ThirdFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contaneree, fragment);
            transaction.commit();

        }
        if(id==R.id.cosmetics){
            Fragment fragment = new FourthFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contanerr, fragment);
            transaction.commit();
        }
        if(id==R.id.electronics){
            Fragment fragment = new FifthFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contanerei, fragment);
            transaction.commit();
        }
        if(id==R.id.gift){


            Fragment fragment = new FirstFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contaner, fragment);
            transaction.commit();
        }
    }
}
