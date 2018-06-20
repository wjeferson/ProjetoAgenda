package com.example.willian.myapplication.classes;


import java.util.Date;
import java.util.Timer;

public class Compromisso {
    private String descricao;
    private String tipo;
    private String data;
    private String hora;

    public Compromisso(String descricao, String tipo,
                       String data, String hora) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
