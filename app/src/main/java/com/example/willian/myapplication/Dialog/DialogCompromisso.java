package com.example.willian.myapplication.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.willian.myapplication.R;
import com.example.willian.myapplication.classes.Compromisso;

import java.util.List;

public class DialogCompromisso extends Dialog
        implements View.OnClickListener {

    public Button btn_ok;
    public Button btn_cancel;
    public EditText edt_desc;
    public EditText edt_tipo;
    public EditText edt_data;
    public EditText edt_hora;
    public List<Compromisso> compromissos;

    public DialogCompromisso(@NonNull Context context, List<Compromisso> compromissos) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog);

        btn_ok = (Button) findViewById(R.id.ok);
        btn_ok.setOnClickListener(this);
        btn_cancel = (Button) findViewById(R.id.editcancel);
        btn_cancel.setOnClickListener(this);
        edt_desc = (EditText) findViewById(R.id.editdescr);
        edt_tipo = (EditText) findViewById(R.id.edittipo);
        edt_data = (EditText) findViewById(R.id.editdata);
        edt_hora = (EditText) findViewById(R.id.edithora);
        this.compromissos = compromissos;
    }

    @Override
    public void onClick(View v){
        if (v==btn_ok){
            compromissos.add(new Compromisso(edt_desc.getText().toString(),
                    edt_tipo.getText().toString(),
                    edt_data.getText().toString(),
                    edt_hora.getText().toString()));
            dismiss();
        }else{
            dismiss();
        }
    }
}
