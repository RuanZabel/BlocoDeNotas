package com.example.bloconotas;

import android.content.Context;
import android.content.SharedPreferences;

public class Notas {
    SharedPreferences notas;
    SharedPreferences.Editor editor;
    Context context;
    private static final String Prefere="notas";
    public Notas(Context context){
        this.context = context;
        notas =this.context.getSharedPreferences(Prefere,Context.MODE_PRIVATE);
        editor = notas.edit();
    }
}
