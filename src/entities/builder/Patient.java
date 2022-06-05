package entities.builder;

import entities.Appointment;
import entities.User;

public class Patient extends User {
    private String name;
    private int age;
    private String patientGender;
    private String diagnostic;
    private int number;
    private String address;
    private int height;
    private int weight;

    private Appointment appointment;


    public Patient(String name, int age, String patientGender, String diagnostic, int number, String address, int height, int weight) {
        this.name = name;
        this.patientGender = patientGender;
        this.age = age;
        this.diagnostic = diagnostic;
        this.number = number;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getPatientGender() {
        return patientGender;
    }
    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    public String getDiagnostic() {
        return diagnostic;
    }
    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String toString() {
        return (getName() + "\n"  + age + "\n" + patientGender + "\n" + diagnostic);

    }
}
