/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphobbies;

import java.util.List;

/**
 *
 * @author laura
 */
public class Carro {
    private String marca;
    private int modelo;
    private String tipo;

    public Carro(String marca, int modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }
        public static void ordenarBurbuja(List<Carro> carros) {
        int n = carros.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (carros.get(j).getModelo() > carros.get(j+1).getModelo()) {
                    Carro temp = carros.get(j);
                    carros.set(j, carros.get(j+1));
                    carros.set(j+1, temp);
                }
            }
        }
    }
}
