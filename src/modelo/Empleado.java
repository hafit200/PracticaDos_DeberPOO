/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Empleado extends Persona {
    String cargo;

    public Empleado() {
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(String cargo, int id, int cedula, String nombres, String direccion, int telefono, String correo, LocalDate fechaNacimiento) {
        super(id, cedula, nombres, direccion, telefono, correo, fechaNacimiento);
        this.cargo = cargo;
    }

    
    }
    
    
         

