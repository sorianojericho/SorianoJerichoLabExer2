package com.example.labexer2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etCourse, etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course5);
        etCourse = findViewById(R.id.et_Course6);
        etCourse = findViewById(R.id.et_Course7);
    }

    public void saveData(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String course = etCourse.getText().toString();
        String course1 = etCourse1.getText().toString();
        String course2 = etCourse2.getText().toString();
        String course3 = etCourse3.getText().toString();
        String course4 = etCourse4.getText().toString();
        String course5 = etCourse5.getText().toString();
        String course6 = etCourse6.getText().toString();
        String course7 = etCourse7.getText().toString();
        editor.putString("course", course);
        editor.putString("course1", course1);
        editor.putString("course2", course2);
        editor.putString("course3", course3);
        editor.putString("course4", course4);
        editor.putString("course5", course5);
        editor.putString("course6", course6);
        editor.putString("course7", course7);
        editor.commit();
        Toast.makeText(this, "data saved in data1.xml", Toast.LENGTH_LONG).show();

    }

    public void verify(View v){
        Intent intent = new Intent();

    }
}
