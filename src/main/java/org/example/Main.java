package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cabinas> listaCabinas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Menú de Gestión de Cabinas");
            System.out.println("1. Crear Cabinas");
            System.out.println("2. Escoger cabina telefonica");
            System.out.println("3. Mostrar informacion detallada");
            System.out.println("4. Mostrar Consolidado total");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Cabinas.crearCabinas(listaCabinas);
                    break;
                case 2:
                    if (listaCabinas.isEmpty()) {
                        System.out.println("No hay cabinas creadas. Por favor, cree una primero.");
                        break;
                    }
                    System.out.print("Ingrese el número de cabina: ");
                    int num = scanner.nextInt();
                    if (num > 0 && num <= listaCabinas.size()) {
                        Cabinas cabina = listaCabinas.get(num - 1);
                        System.out.println("Seleccione el tipo de llamada:");
                        System.out.println("1. Llamada Local");
                        System.out.println("2. Llamada a Distancia");
                        System.out.println("3. Llamada Celular");
                        int tipoLlamada = scanner.nextInt();
                        switch (tipoLlamada) {
                            case 1:
                                cabina.registrarLlamadaLocal();
                                break;
                            case 2:
                                cabina.registrarLlamadaDistancia();
                                break;
                            case 3:
                                cabina.registrarLlamadaCelular();
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } else {
                        System.out.println("Número de cabina inválido.");
                    }
                    break;
            }
        }


    }
}