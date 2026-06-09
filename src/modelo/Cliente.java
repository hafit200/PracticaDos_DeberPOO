/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Cliente {
    //Atributos Globales
    String nombre;
    String apellido;
    int cedula;
    String telefono;
    String direccion;
    
    //Metodo contructor = sirve para inicializar los atributos i=10;
    // Metodo contructor vacio y me permite personalizar los atributos que quiero inicializar 
    public Cliente(){
    
        
    }
  
   // Metodo contructor con argumnetos => variable local
    public Cliente(String nombre,String apellido,int cedula,String telefono,String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.telefono=telefono;
        this.direccion=direccion;
        
    }
}
            
