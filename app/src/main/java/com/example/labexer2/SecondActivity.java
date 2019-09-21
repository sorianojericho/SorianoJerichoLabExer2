package com.example.labexer2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText etCourse, etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course);
        etCourse = findViewById(R.id.et_Course5);
        etCourse = findViewById(R.id.et_Course6);
        etCourse = findViewById(R.id.et_Course7);
        etCourse=findViewById(R.id.editText);
    }

    public void check(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String courseSP = sp.getString("course", null);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course = etCourse.getText().toString();

        if(courseSP.equals(course) || course2SP.equals(course) || course3SP.equals(course) || course4SP.equals(course) ||
                course5SP.equals(course) || course6SP.equals(course) || course7SP.equals(course)) {
            Toast.makeText(this, "course is offered in UST...", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "course is not offered in UST...", Toast.LENGTH_LONG).show();
        }
    }

    public void previous(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
