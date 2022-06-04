package entities.builder;

import entities.Appointment;

public interface Builder {
    void setName(String name);
    void setAge( int age);
    void setPatientGender(String patientGender);
    void setDiagnostic(String diagnostic);
    void setNumber (int number);
    void setAddress ( String address);
    void setHeight (int height);
    void setWeight(int weight);
    void setAppointment( Appointment appointment);
}
