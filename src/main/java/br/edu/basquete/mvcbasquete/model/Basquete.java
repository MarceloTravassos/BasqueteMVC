package br.edu.basquete.mvcbasquete.model;

public class Basquete {
    private String jogador;
    private String time;
    private int idade;

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Basquete(String jogador, String time, int idade) {
        this.jogador = jogador;
        this.time = time;
        this.idade = idade;
    }
}
