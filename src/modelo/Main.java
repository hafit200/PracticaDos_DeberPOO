/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {

        //int[] numerosPares = new int[501];
        //for (int i = 0; i < 1000; i++) {
        //    numerosPares[i] = i + 2;
        //    System.out.println(numerosPares[i++]);
        //}
        // ejercicio 2
        int[] listaUno = new int[10];
        for (int i = 0; i < 10; i++) {
            listaUno[i] = Integer.parseInt(JOptionPane.showInputDialog("INgrese un numero en lista 1"));
        }

        int[] listaDos = new int[10];
        for (int i = 0; i < 10; i++) {
            listaDos[i] = Integer.parseInt(JOptionPane.showInputDialog("INgrese un numero en lista 2"));
        }

        int[] listaTres = new int[10];
        for (int i = 0; i < 10; i++) {
            listaTres[i] = listaUno[i] + listaDos[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("listaTres[" + i + "] = " + listaTres[i]);
        }

        // DEBER !
        int[] primo = new int[10];

        for (int i = 0; i < 10; i++) {
            primo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        }

        // Verificar si son primos
        for (int i = 0; i < 10; i++) {

            boolean esPrimo = true;

            if (primo[i] <= 1) {
                esPrimo = false;
            } else {

                for (int j = 2; j < primo[i]; j++) {

                    if (primo[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }

                }

            }

            if (esPrimo) {
                System.out.println(primo[i] + " es primo");
            } else {
                System.out.println(primo[i] + " no es primo");
            }

        }

        //Deber 2
        double[] derecho = new double[10];
        double[] revez = new double[10];

        for (int i = 0; i < 10; i++) {
            derecho[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los primero 10 numeros decimales con un punto"));
        }

        for (int i = 0; i < 10; i++) {
            revez[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los siguientes 10 numeros decimales con un punto"));
        }

        for (int i = 0; i < 10; i++) {
            double n = derecho[i] * revez[9 - i];
            System.out.println(derecho[i] + " * " + revez[9 - i] + " = " + n);

        }

        //Deber 3
        Persona a1 = new Persona();
        a1.setNombres("Juan Pérez");

        Persona a2 = new Persona();
        a2.setNombres("María González");

        Persona a3 = new Persona();
        a3.setNombres("Carlos Rodríguez");

        Persona a4 = new Persona();
        a4.setNombres("Ana López");

        Persona a5 = new Persona();
        a5.setNombres("Luis Martínez");

        Libros l1 = new Libros("Cien años de soledad", 1, 25.50);
        Libros l2 = new Libros("Don Quijote de la Mancha", 2, 32.00);
        Libros l3 = new Libros("El Principito", 3, 15.75);
        Libros l4 = new Libros("1984", 4, 21.90);
        Libros l5 = new Libros("Harry Potter y la piedra filosofal", 5, 29.99);
        Libros l6 = new Libros("El Señor de los Anillos", 6, 45.00);
        Libros l7 = new Libros("La Metamorfosis", 7, 18.50);

        Persona[] personas = {a1, a2, a3, a4, a5};

        Libros[] libros = {l1, l2, l3, l4, l5, l6, l7};

        System.out.println(personas[0].getNombres());
        System.out.println("- " + libros[0].getTitulo());
        System.out.println("- " + libros[1].getTitulo());
        System.out.println("- " + libros[2].getTitulo());

        System.out.println();

        System.out.println(personas[1].getNombres());
        System.out.println("- " + libros[2].getTitulo());
        System.out.println("- " + libros[3].getTitulo());
        System.out.println("- " + libros[4].getTitulo());

        System.out.println();

        System.out.println(personas[2].getNombres());
        System.out.println("- " + libros[1].getTitulo());
        System.out.println("- " + libros[5].getTitulo());
        System.out.println("- " + libros[6].getTitulo());

        System.out.println(personas[3].getNombres());
        System.out.println("- " + libros[3].getTitulo());
        System.out.println("- " + libros[1].getTitulo());
        System.out.println("- " + libros[7].getTitulo());

        
        
        
        
        // Deber 4
        String oracion = JOptionPane.showInputDialog("Ingrese una oración");

        char[] lista = new char[oracion.length()];

        int vocales = 0;
        int consonantes = 0;
        int espacios = 0;

        for (int i = 0; i < oracion.length(); i++) {

            lista[i] = oracion.charAt(i);

            if (lista[i] == ' ') {
                espacios++;
            } else if (lista[i] == 'a' || lista[i] == 'e' || lista[i] == 'i' || lista[i] == 'o' || lista[i] == 'u'
                    || lista[i] == 'A' || lista[i] == 'E' || lista[i] == 'I' || lista[i] == 'O' || lista[i] == 'U') {
                vocales++;
            } else if (Character.isLetter(lista[i])) {
                consonantes++;
            }
        }

        System.out.println("===== Lista de caracteres =====");

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Posición " + i + ": " + lista[i]);
        }

        System.out.println();
        System.out.println("===== Resultados =====");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Espacios en blanco: " + espacios);

    }
}


