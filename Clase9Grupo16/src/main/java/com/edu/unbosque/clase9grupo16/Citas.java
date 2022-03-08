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
public class Citas {

    Mascota masc;
    String motivo;
    String fechaCita;
    String horaCita;

    
    public Citas() {
        this.masc = new Mascota();
        this.motivo = "Control";
        Scanner lectura=new Scanner(System.in);
        System.out.println("Fecha de la cita");
        this.fechaCita = lectura.next();
        System.out.println("Hora de la cita");
        this.horaCita = lectura.next();
        System.out.println("Cita Creada exitosamente");
    }
    public Citas(Mascota masc, String fechaCita, String horaCita) {
        this.masc = masc;
        this.motivo = "Control";
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public Citas(Mascota masc, String motivo, String fechaCita, String horaCita) {
        this.masc = masc;
        this.motivo = motivo;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public Mascota getMasc() {
        return masc;
    }

    public void setMasc(Mascota masc) {
        this.masc = masc;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String MostrarCita() {
        String cita = "";
        cita = cita + "Fecha: " + this.fechaCita + " Hora: " + this.horaCita
                + "\nMotivo: " + this.motivo + "\nNOmbre del Paciente: " + this.masc.getNombre()
                + "\nRaza: " + this.masc.getRaza();
        return cita;
    }

}
