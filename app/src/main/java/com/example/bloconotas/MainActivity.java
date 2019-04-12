package com.example.bloconotas;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Notas nota = null;
    EditText edit;
    TextView text;

    protected void onCreate(Bundle savedInstanceState) {
         nota = new Notas(this);
         text = findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.edit);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nota.salvarNota(edit.getText().toString());
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    protected void onStart(){
        super.onStart();
        edit.setText(nota.recuperarNota());
    }
    @Override
    protected void onStop() {
        super.onStop();
        nota.salvarNota();
        text.setText(n);
    }

}
