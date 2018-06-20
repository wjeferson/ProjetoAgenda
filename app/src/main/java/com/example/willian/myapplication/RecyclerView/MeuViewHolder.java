package com.example.willian.myapplication.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.willian.myapplication.Dialog.DialogCompromisso;
import com.example.willian.myapplication.Dialog.DialogEditCompromisso;
import com.example.willian.myapplication.R;
import com.example.willian.myapplication.classes.Compromisso;

import java.util.List;

/**
 * Created by Alberto on 20/06/2018.
 */

public class MeuViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{

    final TextView txDesc;
    final TextView txTipo;
    final TextView txHora;
    final TextView txData;
    public List<Compromisso> compromissos;
    public Button btn_att;
    public Button btn_remove;
    public Context context;

    public MeuViewHolder(View itemView, List<Compromisso> compromissos, Context context) {
        super(itemView);
        this.txDesc = (TextView) itemView.findViewById(R.id.textDesc);
        this.txTipo = (TextView) itemView.findViewById(R.id.textTipo);
        this.txHora = (TextView) itemView.findViewById(R.id.textHora);
        this.txData = (TextView) itemView.findViewById(R.id.textData);
        this.compromissos = compromissos;

        this.context = context;

        itemView.setOnClickListener(this);

        btn_att = (Button) itemView.findViewById(R.id.atualizar);
        btn_att.setOnClickListener(this);

        btn_remove = (Button) itemView.findViewById(R.id.remover);
        btn_remove.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==btn_att){
            DialogEditCompromisso dialogCompromisso = new DialogEditCompromisso
                    (context, compromissos,getAdapterPosition());
            dialogCompromisso.show();
        }else if(v==btn_remove){
            Log.d("Aqui","Elemento " + getAdapterPosition() + " clicado.");
            compromissos.remove(getAdapterPosition());
        }

    }
}
