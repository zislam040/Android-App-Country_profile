package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

     private ImageView imageView;
     private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        imageView= (ImageView)findViewById(R.id.imageId);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null){

            String countryName= bundle.getString("name");
            showDetails(countryName);
        }
    }


    void showDetails(String countyName){

         if (countyName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_shangshad);
            textView.setText(R.string.bangladesh_text);
        }

        if (countyName.equals("india")){
            imageView.setImageResource(R.drawable.india_taz);
            textView.setText(R.string.india_text);
        }

        if (countyName.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakistan_histry);
            textView.setText(R.string.pakistan_text);
        }
    }
}
