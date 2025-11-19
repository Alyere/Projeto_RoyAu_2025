package model;

public class Tutor {
    public static int contador = 1;

    private int id;
    private String nome;
    private String telefone;
    private int pontos;

    public Tutor(String nome, String telefone){
        this.id = contador++;
        this.nome = nome;
        this.telefone = telefone;
        this.pontos = pontos;

    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public int getPontos(){
        return pontos;
    }

    public void adcionarPontos(int quantidade){
        this.pontos +=quantidade;
    }

}
