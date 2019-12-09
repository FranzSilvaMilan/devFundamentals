package FinalTasks;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 primerNumeroRepetido;
        int[] lista = new int[]{2, 1, 3, 5, 3, 2};
        System.out.println(primerRepetido(lista));
    }

    public static String primerRepetido(int[] numeros) {
        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        for (int i = 0; i < numeros.length; i++) {
            int marca = numeros[i];
            int contador = 0;
            if (mapa.containsKey(marca)) {
                return "El numero "+ marca+ " es el primer repetido";
            }
            mapa.put(marca, contador);
        }
        return "-1";
    }
}
