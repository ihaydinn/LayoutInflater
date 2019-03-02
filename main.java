package com.ismailhakkiaydin.layouinflater;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relative;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relative= (RelativeLayout) findViewById(R.id.activity_main);
        linear= (LinearLayout) findViewById(R.id.my_linear_layout);



        // LayoutInflater lif=getLayoutInflater();
        LayoutInflater lif= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View v=lif.inflate(R.layout.sublayout, relative);
        // View v=lif.inflate(R.layout.sublayout, relative,true);
        //Yukarıdaki iki satır kodun yaptığı iş aynıdır. Farklılık true yerine false yazdığımızda ortaya çıkar.
//false yazıldıgında sublayout, örneğimizde relative olarak belirlediğimiz view öğesine eklenmez ama onun Layoutparams özelliklerini kullanır.


        //relative.addView(v);

        View v=lif.inflate(R.layout.layout_diger, linear, false);
        linear.addView(v);



    }
}
