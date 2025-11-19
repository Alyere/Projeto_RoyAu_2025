package model;

public class Tosa extends Servico{
    public Tosa(){
        super("Tosa", 25);
    }

    @Override
    public double calcularPreco(Pet pet){
        double preco = precoBase;

        switch(pet.getTipoPelo()){
            case MEDIO -> preco +=10;
            case LONGO -> preco +=15;
        }
        return preco;
    }
}
