package com.example.bloconotas;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

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

    public String recuperarNota(){
        if(this.notas.contains("notas")){
            String s = "Salvo";
            Toast.makeText(this.context,s,Toast.LENGTH_LONG).show();
            return this.notas.getString("notas","");
        }else {
            return "";
        }
    }
    public void salvarNota(String texto){
        this.editor.putString("notas",texto);
        this.editor.commit();
    }
}
