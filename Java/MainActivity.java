package com.cs2415.fragmentproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnfraA,btnfraB,btnfraC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfraA=findViewById(R.id.btnfraA);
        btnfraB=findViewById(R.id.btnfraB);
        btnfraC=findViewById(R.id.btnfraC);
        loadFrag(new BFragment(),0);//default fragment
        btnfraA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new AFragment(),1);

            }
        });
        btnfraB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new BFragment(),1);

            }
        });
        btnfraC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               loadFrag(new Cfragment(),1);

            }
        });
    }
    public void  loadFrag(Fragment fragmnet,int flag)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag==0)
           ft.add(R.id.container,fragmnet);
        else
            ft.replace(R.id.container,fragmnet);

        ft.commit();
    }
}
