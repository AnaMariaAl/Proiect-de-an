package entities;

import entities.builder.Patient;
import entities.builder.PatientBuilder;
import entities.composite.DepartmentHead;
import entities.iterator.Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Hospital h1 = Hospital.getInstance("Ana's Hospital");
          Facade facade = new Facade();


            PatientBuilder patientbuilder = new PatientBuilder();
            patientbuilder.setDiagnostic("miopie");
            patientbuilder.setAge(24);
            patientbuilder.setPatientGender("F");
            patientbuilder.setName("Laura");
            Patient p1 = patientbuilder.getResult();


            PatientBuilder patientbuilder2 = new PatientBuilder();
            patientbuilder2.setDiagnostic("artroz");
            patientbuilder2.setAge(70);
            patientbuilder2.setPatientGender("M");
            patientbuilder2.setName("ION");
            Patient p2 = patientbuilder2.getResult();

            Patient[] patients = {p1,p2};


//        p1.getAppointment().printStatus();//print app
//        p1.getAppointment().nextState(); // confirm app

           p1.setAppointment(new Appointment());
           Appointment app = p1.getAppointment();
            app.setReason("pain");

            System.out.println("Enter your name :");
            Scanner sn =  new Scanner(System.in);
              String namep = sn.next();

             Patient foundPatient = null;

            for(int i=0; i < patients.length; i++) {
                Patient patient = patients[i];
                if (namep.equalsIgnoreCase(patient.getName())) {
                    foundPatient = patients[i];
                    break;

                } else {
                    System.out.println("Enter your age :");
                    int age = sn.nextInt();
                    System.out.println("Enter your gender");
                    String gender = sn.next();
                    System.out.println("Enter your diagnostic");
                    String diagnostic = sn.next();
                    PatientBuilder patientbuilder3 = new PatientBuilder();
                    patientbuilder3.setDiagnostic(diagnostic);
                    patientbuilder3.setAge(age);
                    patientbuilder3.setPatientGender(gender);
                    patientbuilder3.setName(namep);
                    foundPatient = patientbuilder3.getResult();
                    break;
                }
            }
            System.out.println(foundPatient);
            System.out.println("You don't have any appointments at this moment");
            System.out.println("Do you want to create an appointment? (Y/N)");
            String response = sn.next();
            if(response.equalsIgnoreCase("Y")) {
                facade.showDoctors(h1);
            }

        System.out.println("Select Doctors");
        System.out.println("Select doctor's name:");
        String doctorName = sn.next();

        Doctor foundDoctor = null;
        Doctor[] avaibleDoctors = {};
        for(int i=0; i < h1.doctorList.size(); i++) {
            Doctor doctor = doctors[];
            if (foundDoctor.equalsIgnoreCase(doctor.getName())) {
                foundPatient = doctors[i];
                break;







//       // System.out.println(" Press 1 to add doctor\n Press 2 to show doctors\n Press 3 to add patient\n Press 4 Assign doctor to patients\n Press 5 Doctor and their patients ");
//       // Scanner cin = new Scanner(System.in);
//        // choice = cin.nextInt();
//        //switch (choice) {
//

        }
    }

//}

