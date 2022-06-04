package entities;

import entities.builder.Patient;
import entities.builder.PatientBuilder;
import entities.composite.DepartmentHead;
import entities.iterator.Iterator;

import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Hospital h1 = Hospital.getInstance("Ana's Hospital");
        Iterator iterator = h1.getIterator();
        System.out.println("List of doctors : ");
        while(iterator.hasNext()) {
            Doctor doctor = (Doctor) iterator.next();
            System.out.println(doctor);

            DepartmentHead departmentHead = new DepartmentHead(" David Langer","Neurology");
        }

        PatientBuilder patientbuilder = new PatientBuilder();
        patientbuilder.setDiagnostic("miopie");
        patientbuilder.setAge(24);
        patientbuilder.setPatientGender("F");
        patientbuilder.setName("Laura");
        patientbuilder.setAppointment(new Appointment());
        Patient p1 = patientbuilder.getResult();
        System.out.println(p1);

        p1.getAppointment().printStatus();//print app
        p1.getAppointment().nextState(); // confirm app

       // System.out.println(" Press 1 to add doctor\n Press 2 to show doctors\n Press 3 to add patient\n Press 4 Assign doctor to patients\n Press 5 Doctor and their patients ");
       // Scanner cin = new Scanner(System.in);
        // choice = cin.nextInt();
        //switch (choice) {


        }
    }
//}

