package entities.builder;

import entities.Appointment;

public class PatientBuilder implements Builder {

    private String name;
    private int age;
    private String patientGender;
    private String diagnostic;
    private int number;
    private String address;
    private int height;
    private int weight;
    private Appointment appointment;

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    @Override
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Patient getResult() {
        return new Patient( name,age,patientGender,diagnostic,number,address,height,weight,appointment);
    }
}
