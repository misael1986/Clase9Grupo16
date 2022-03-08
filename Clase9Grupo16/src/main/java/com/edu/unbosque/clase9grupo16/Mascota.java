/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase9grupo16;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Mascota {
    
    private String nombre;
    private int edad;
    private String raza;
    private String tipo;
    private double tamanho;
    private double peso;

    public Mascota(String nombre, int edad, String raza, String tipo, double tamanho, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.peso = peso;
    }
    
    public Mascota(){
        System.out.println("Crear Mascota:\nNOmbre: ");
        Scanner tec=new Scanner(System.in);
        this.nombre=tec.next();
        System.out.println("Edad: ");
        this.edad=tec.nextInt();
        System.out.println("Raza: ");
        this.raza=tec.next();
        System.out.println("Tipo: ");
        this.tipo=tec.next();
        System.out.println("Tamaño: ");
        this.tamanho=tec.nextDouble();
        System.out.println("Peso: ");
        this.peso=tec.nextDouble();
        
    }

  
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tamanho
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
