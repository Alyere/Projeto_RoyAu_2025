package model;

import enums.Comportamento;
import enums.Porte;

public class Banho extends Servico{
    public Banho(){
        super("Banho", 40);
    }

    @Override
    public double calcularPreco(Pet pet){
        double preco = precoBase;

        if (pet.getporte() == Porte.MEDIO){
            preco +=10;
        }else if(pet.getporte() == Porte.GRANDE){
            preco +=20;
        }

        if(pet.getComportamento() == Comportamento.AGITADO){
            preco += 5;
        }else if(pet.getComportamento() == Comportamento.AGRESSIVO){
            preco +=15;
        }

        return preco;
    }
}
