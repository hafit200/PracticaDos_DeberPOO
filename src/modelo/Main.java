/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
       // BEBIDAS
        Bebida b1 = new Bebida();
        b1.nombre = "Coca Cola";
        b1.proveedor = "Coca Cola Company";
        b1.cliente = "Antonio";
        b1.vendedor = "Juan";

        Bebida b2 = new Bebida();
        b2.nombre = "Pepsi";
        b2.proveedor = "PepsiCo";
        b2.cliente = "Maria";
        b2.vendedor = "Carlos";

        Bebida b3 = new Bebida();
        b3.nombre = "Sprite";
        b3.proveedor = "Coca Cola Company";
        b3.cliente = "Pedro";
        b3.vendedor = "Ana";

        Bebida b4 = new Bebida();
        b4.nombre = "Fanta";
        b4.proveedor = "Coca Cola Company";
        b4.cliente = "Luis";
        b4.vendedor = "Diego";

        Bebida b5 = new Bebida();
        b5.nombre = "Agua";
        b5.proveedor = "Tesalia";
        b5.cliente = "Sofia";
        b5.vendedor = "Marta";

        // LACTEOS
        Lacteo la1 = new Lacteo();
        la1.nombre = "Leche";
        la1.proveedor = "Toni";
        la1.cliente = "Jorge";
        la1.vendedor = "Paula";

        Lacteo la2 = new Lacteo();
        la2.nombre = "Yogur";
        la2.proveedor = "Toni";
        la2.cliente = "Valeria";
        la2.vendedor = "Miguel";

        Lacteo la3 = new Lacteo();
        la3.nombre = "Queso";
        la3.proveedor = "Kiosko";
        la3.cliente = "Fernando";
        la3.vendedor = "Andrea";

        Lacteo la4 = new Lacteo();
        la4.nombre = "Mantequilla";
        la4.proveedor = "Toni";
        la4.cliente = "Daniel";
        la4.vendedor = "Lucia";

        Lacteo la5 = new Lacteo();
        la5.nombre = "Crema";
        la5.proveedor = "Toni";
        la5.cliente = "Carmen";
        la5.vendedor = "Ricardo";

        // LACTEOS
        Lacteo t1 = new Lacteo();
        t1.nombre = "Leche";
        t1.proveedor = "Toni";
        t1.cliente = "Jorge";
        t1.vendedor = "Paula";

        Lacteo t2 = new Lacteo();
        t2.nombre = "Yogur";
        t2.proveedor = "Toni";
        t2.cliente = "Valeria";
        t2.vendedor = "Miguel";

        Lacteo t3 = new Lacteo();
        t3.nombre = "Queso";
        t3.proveedor = "Kiosko";
        t3.cliente = "Fernando";
        t3.vendedor = "Andrea";

        Lacteo t4 = new Lacteo();
        t4.nombre = "Mantequilla";
        t4.proveedor = "Toni";
        t4.cliente = "Daniel";
        t4.vendedor = "Lucia";

        Lacteo t5 = new Lacteo();
        t5.nombre = "Crema";
        t5.proveedor = "Toni";
        t5.cliente = "Carmen";
        t5.vendedor = "Ricardo";

        // SNACKS
        Snack s1 = new Snack();
        s1.nombre = "Doritos";
        s1.proveedor = "PepsiCo";
        s1.cliente = "Andrea";
        s1.vendedor = "Juan";

        Snack s2 = new Snack();
        s2.nombre = "Cheetos";
        s2.proveedor = "PepsiCo";
        s2.cliente = "Carlos";
        s2.vendedor = "Ana";

        Snack s3 = new Snack();
        s3.nombre = "Oreo";
        s3.proveedor = "Mondelez";
        s3.cliente = "Maria";
        s3.vendedor = "Pedro";

        Snack s4 = new Snack();
        s4.nombre = "Chifles";
        s4.proveedor = "Inalecsa";
        s4.cliente = "Luis";
        s4.vendedor = "Marta";

        Snack s5 = new Snack();
        s5.nombre = "Papas Fritas";
        s5.proveedor = "Inalecsa";
        s5.cliente = "Sofia";
        s5.vendedor = "Diego";

        // LIMPIEZA
        Limpieza l1 = new Limpieza();
        l1.nombre = "Jabon";
        l1.proveedor = "Unilever";
        l1.cliente = "Antonio";
        l1.vendedor = "Carlos";

        Limpieza l2 = new Limpieza();
        l2.nombre = "Detergente";
        l2.proveedor = "Unilever";
        l2.cliente = "Valeria";
        l2.vendedor = "Miguel";

        Limpieza l3 = new Limpieza();
        l3.nombre = "Cloro";
        l3.proveedor = "Clorox";
        l3.cliente = "Fernando";
        l3.vendedor = "Lucia";

        Limpieza l4 = new Limpieza();
        l4.nombre = "Desinfectante";
        l4.proveedor = "Lysol";
        l4.cliente = "Carmen";
        l4.vendedor = "Paula";

        Limpieza l5 = new Limpieza();
        l5.nombre = "Lavavajillas";
        l5.proveedor = "Axion";
        l5.cliente = "Jorge";
        l5.vendedor = "Ricardo";
    }
}
