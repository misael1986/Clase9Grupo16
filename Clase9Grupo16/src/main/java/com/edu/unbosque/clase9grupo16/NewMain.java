/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase9grupo16;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Veterinaria vetmed=new Veterinaria();
        System.out.println(vetmed.getNombre());
        Scanner data= new Scanner(System.in);
        System.out.println("Cambiemos el Nombre: ");
        vetmed.setNombre(data.nextLine());
        System.out.println(vetmed.getNombre());
        */
        
        Veterinaria vet2=new Veterinaria("MascoHogar");
        Veterinaria vet3=new Veterinaria("Laika",2);
        Veterinaria vet4=new Veterinaria("Laika",1);
        JOptionPane.showMessageDialog(null,vet3.cabezaFactura());
        //Usenlo por gusto y NO para entregar en VPL.
        /*
        Mascota munheca=new Mascota();
        munheca.setNombre("Muñeca");
        munheca.setEdad(7);
        */
        Mascota bruce=new Mascota("Bruce",10,"Criollo","Gato",0.805,7.3);
        Mascota kuzuzu=new Mascota("Kuzuzu",10,"Criollo","Perro",1.2,22);
        
        Citas cita1=new Citas(kuzuzu,"22-07-2021","14:00");
        System.out.println(cita1.MostrarCita());
        JOptionPane.showMessageDialog(null,cita1.MostrarCita());
        
        Citas kira=new Citas();
        System.out.println(kira.MostrarCita());
        
    }
    
}
