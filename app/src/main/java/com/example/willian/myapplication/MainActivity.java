package com.example.willian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.willian.myapplication.Dialog.DialogCompromisso;
import com.example.willian.myapplication.RecyclerView.MeuAdapter;
import com.example.willian.myapplication.classes.Compromisso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView.LayoutManager layoutManager;
    public RecyclerView.Adapter adapter;
    public List<Compromisso> compromissos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        compromissos = new ArrayList<>();

        adapter = new MeuAdapter(compromissos, this);
        recyclerView.setAdapter(adapter);
        recyclerView.invalidate();
    }

    public void criarCompromisso(View v){
        DialogCompromisso dialogCompromisso = new DialogCompromisso(this, compromissos);
        dialogCompromisso.show();
    }

    public void att(View v){
        adapter.notifyDataSetChanged();
    }
}
