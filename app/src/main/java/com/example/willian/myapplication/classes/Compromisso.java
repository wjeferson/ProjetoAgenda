package com.example.willian.myapplication.classes;


import java.util.Date;
import java.util.Timer;

public class Compromisso {
    private String descricao;
    private String tipo;
    private Date data;
    private Timer hora;

    public Compromisso(String descricao, String tipo,
                       Date data, Timer hora) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
    }
}
