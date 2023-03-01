package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main( String[] args ) throws IOException {

        float litrosDeGasolina = 0.52f;
        int precioDeGasolina = 580;

        out.println("Indique la distancia en km entre el punto A y B");
        int distancia = Integer.parseInt(in.readLine());

        //Calculos
        float totalDeLitros = litrosDeGasolina * distancia;
        int valorDeGasolina = (int) (totalDeLitros * precioDeGasolina);

        out.println("Litros requeridos para realizar el viaje: " + totalDeLitros +
                " litros de gasolina tienen un valor de " + valorDeGasolina);
    }
}
