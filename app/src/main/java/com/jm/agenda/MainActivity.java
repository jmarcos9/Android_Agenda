package com.jm.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}

/*
or create a new repository on the command line
echo "# Android_Agenda" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/jmarcos9/Android_Agenda.git
git push -u origin main

…or push an existing repository from the command line
git remote add origin https://github.com/jmarcos9/Android_Agenda.git
git branch -M main
git push -u origin main
* */
