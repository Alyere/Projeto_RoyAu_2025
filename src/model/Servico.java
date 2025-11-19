package model;

public abstract class Servico {
    private static int contador = 1;

    protected int id;
    protected String nome;
    protected Double precoBase;

    public Servico(String nome, double precoBase){
        this.id = contador++;
        this.nome = nome;
        this.precoBase = precoBase;

    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco(Pet pet);
}
