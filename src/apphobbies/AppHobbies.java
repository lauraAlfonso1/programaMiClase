/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apphobbies;

import static apphobbies.Carro.ordenarBurbuja;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laura
 */
public class AppHobbies {


   public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Toyota", 2021, "camioneta"));
        carros.add(new Carro("Ford", 2019, "camioneta"));
        carros.add(new Carro("Honda", 2013, "sedan"));
        carros.add(new Carro("BMW", 2019, "sedan"));
        carros.add(new Carro("Volkswagen", 2018, "camioneta"));

        ordenarBurbuja(carros);
        System.out.println("los siguientes carros estan ordenados de menor a mayor segun su modelo(metodo burbuja)");
        for (Carro carro : carros) {
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Tipo: " + carro.getTipo());
            System.out.println();
        }
    }
}
