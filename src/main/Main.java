/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;

/**
 *
 * @author darkheaven
 */
public class Main {
    public static void main(String[] args) { 
    System.setProperty("https.protocols", "TLSv1.2");
        
        Paciente paciente = new Paciente("Ramoncito", "tavito0miedo", "6221205047");
        Medico medico = new Medico("Alvarado", "gftyvgyvgyvgyvgvgy@gmail.com");

        Cita cita = new Cita("2025-11-05", "10:00", paciente, medico, "Consulta general");


        paciente.enviarConfirmacionCita(cita);

        medico.enviarNotificacionCita(cita);
    }
}      


