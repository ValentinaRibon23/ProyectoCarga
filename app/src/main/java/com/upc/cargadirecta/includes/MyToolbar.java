package com.upc.cargadirecta.includes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.upc.cargadirecta.R;

public class MyToolbar {

    public static void show(AppCompatActivity activity, String title, boolean upBotton){

       Toolbar toolbar = activity.findViewById(R.id.toolbar_id);  /*REFERENCIA AL TOOLBAR*/
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle(title);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(upBotton);

    }

}
