package entities;

import entities.builder.Patient;
import entities.builder.PatientBuilder;

import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Facade facade = new Facade();

        Patient[] patients = facade.createPatients();
        Patient patient = facade.findOrCreatePacient(patients);
        Appointment appointment = facade.createAppointment(patient);
        System.out.println(appointment);

    }

}





