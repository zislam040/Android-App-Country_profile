package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton, indiaButton, pakistanButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton= (Button) findViewById(R.id.bangladeshButtonId);
        indiaButton= (Button) findViewById(R.id.indiaButtonId);
        pakistanButton=(Button) findViewById(R.id.pakistanButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bangladeshButtonId){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }

        if (v.getId()==R.id.indiaButtonId){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }

        if (v.getId()==R.id.pakistanButtonId){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBilder;
        alertDialogBilder= new AlertDialog.Builder(MainActivity.this);



        alertDialogBilder.setIcon(R.drawable.uestion);
        alertDialogBilder.setTitle(R.string.title_text);
        alertDialogBilder.setMessage(R.string.message_text);
        alertDialogBilder.setCancelable(false);


        alertDialogBilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        alertDialogBilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog= alertDialogBilder.create();
        alertDialog.show();

    }
}
