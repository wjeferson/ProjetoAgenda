package com.example.willian.myapplication.RecyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.willian.myapplication.R;
import com.example.willian.myapplication.classes.Compromisso;

import java.util.List;

/**
 * Created by Alberto on 20/06/2018.
 */

public class MeuAdapter extends RecyclerView.Adapter  {

    private Context context;
    private List<Compromisso> compromissos;
    private View view;

    public MeuAdapter(List<Compromisso> compromissos, Context context) {
        this.context = context;
        this.compromissos = compromissos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.list_compromissos, parent, false);

        MeuViewHolder viewHolder = new MeuViewHolder(view, compromissos, context);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        final MeuViewHolder viewHolder = (MeuViewHolder) holder;
        viewHolder.txDesc.setText(compromissos.get(position).getDescricao());
        viewHolder.txTipo.setText(compromissos.get(position).getTipo());
        viewHolder.txData.setText(compromissos.get(position).getData());
        viewHolder.txHora.setText(compromissos.get(position).getHora());
    }

    @Override
    public int getItemCount() {
        return compromissos.size();
    }


}
