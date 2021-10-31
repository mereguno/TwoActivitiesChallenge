package com.example.twoactivitieschallenge;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static String passage;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setPassage1(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        passage = getString(R.string.passage_1_text);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }

    public void setPassage2(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        passage = getString(R.string.passage_2_text);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }

    public void setPassage3(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        passage = getString(R.string.passage_3_text);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }
}