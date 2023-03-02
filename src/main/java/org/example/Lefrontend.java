package org.example;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digita la cantidad de producto: ");
        Integer canditadProducto = entrada.nextInt();
        System.out.println("La cantidad fue: " + canditadProducto);

        // Como obtener una fecha del sistema
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        // Como asugnar una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023, 2, 24);
        System.out.println(fecha2);

        //encontrar la diferencia entre 2 fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println(diferenciaEntreFechas);

    }
}