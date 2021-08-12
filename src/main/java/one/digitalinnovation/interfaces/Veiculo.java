package one.digitalinnovation.interfaces;

import java.awt.*;

public interface Veiculo {

    String registro();

    default void ligar(){
        System.out.println("Ligando o veículo");
    }
    // Void desligar();

    /*
    default void desligar(){
        System.out.println("Desligando o veículo!");
    }*/
}
