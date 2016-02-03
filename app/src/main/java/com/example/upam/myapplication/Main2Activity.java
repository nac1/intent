package com.example.upam.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView resulados;
    String url=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resulados=(TextView)findViewById(R.id.textView);

        Bundle bundle=getIntent().getExtras();
        String nombre,edad;
        nombre=bundle.getString("nombre");
        edad=bundle.getString("edad");
        url=bundle.getString("url");
        resulados.setText("el nombre: "+nombre+" edad: "+edad);



    }


    public void explorador(View v)
    {
        Intent explorar=new Intent(Intent.ACTION_VIEW);

        explorar.setData(Uri.parse(url));

        startActivity(explorar);


    }



}
