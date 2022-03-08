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
public class Veterinaria {

    private String nombre;
    private String direccion;
    private String telefono;
    private int nroSede;
    private String nit;

    Veterinaria() {//Crear o Construir el Objeto con Datos por defecto o de inicio
        this.nroSede = 0;//Documentado que cuando esta valor es 0 es porque es sede Unica
    }

    Veterinaria(String nom) {
        this.nombre = nom;
    }

    Veterinaria(String nom, int se) {
        this.nombre = nom;
        this.nroSede = se;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nroSede
     */
    public int getNroSede() {
        return nroSede;
    }

    /**
     * @param nroSede the nroSede to set
     */
    public void setNroSede(int nroSede) {
        this.nroSede = nroSede;
    }

    public void setNit(String n) {
        this.nit = n;
    }

    public String getNit() {
        return this.nit;
    }

    public String cabezaFactura() {
        String cabezote = "";
        if (this.nroSede != 0) {
            cabezote += this.nombre + " - Sede " + this.nroSede + "\nDirección: "
                    + this.direccion + "\nNIT: " + this.nit
                    + "\nTelefono: " + this.telefono;
        } else {
            cabezote += this.nombre + "\nDirección: "
                    + this.direccion + "\nNIT: " + this.nit
                    + "\nTelefono: " + this.telefono;
        }
        return cabezote;
    }

}
