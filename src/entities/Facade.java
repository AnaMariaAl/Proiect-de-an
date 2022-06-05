package entities;

import entities.Doctor;
import entities.Hospital;
import entities.builder.Patient;
import entities.builder.PatientBuilder;
import entities.iterator.Iterator;

import java.util.Scanner;

public class Facade {
    Hospital h1 = Hospital.getInstance("Ana's Hospital");
    Scanner sn = new Scanner(System.in);
    public void showDoctors() {
        Iterator iterator = h1.getIterator();
        while (iterator.hasNext()) {

            Doctor doctor = (Doctor) iterator.next();
            System.out.println(doctor);
        }
    }

    public Doctor foundDoctor(String name) {
        Iterator iterator = h1.getIterator();
        Doctor x = null;
        while (iterator.hasNext()) {

            Doctor d = (Doctor) iterator.next();
            if (d.getName().equalsIgnoreCase(name)) {
                x = d;
            }

        }
        return x;
    }

    public Patient findOrCreatePacient(Patient[] patients) {
        System.out.println("Enter your name :");
        String namep = sn.next();

        Patient foundPatient = null;
        for (int i = 0; i < patients.length; i++) {
            Patient patient = patients[i];
            if (namep.equalsIgnoreCase(patient.getName())) {
                foundPatient = patients[i];
                break;

            } else {
                System.out.println("Patient with that name doesn't exist please write the details");
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
        return foundPatient;
    }
        public Patient[] createPatients () {
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
            Patient[] patients = {p1, p2};
            return patients;
        }


        public Appointment createAppointment(Patient patient){
            System.out.println("You don't have any appointments at this moment");
            System.out.println("Do you want to create an appointment? (Y/N)");
            String response = sn.next();
            Appointment appointment = null;
            if (response.equalsIgnoreCase("Y")) {
                this.showDoctors();
                System.out.println("Select Doctor's name:");
                String doctorName = sn.next();

                Doctor foundDoctor = this.foundDoctor(doctorName);
                System.out.println(foundDoctor.getName());
                System.out.println("Enter the desired time:");
                String time = sn.next();
                System.out.println("Enter the desired date:");
                String date = sn.next();
                System.out.println("Enter the reason:");
                String reason = sn.next();
                appointment = new Appointment();
                appointment.setTime(time);
                appointment.setDate(date);
                appointment.setReason(reason);
                appointment.setDoctor(foundDoctor);
                appointment.setPatient(patient);


            } else {
                System.out.println("You didn't make any appointments");
                System.exit(1);
            }
            return appointment;
        }

    }

