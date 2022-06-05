package entities;

import entities.builder.Patient;
import entities.composite.Employee;

import java.util.ArrayList;
import java.util.List;

public class Doctor  implements Employee {

    private String name;
    private String doctorSpeciality;

    List<Patient> doctorPatientList = new ArrayList<Patient>();

     public Doctor (String name, String speciality) {
        this.doctorSpeciality = speciality;
        this.name = name;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public List<Patient> getDoctorPatientList() {
        return doctorPatientList;
    }

    public void addPatientsToDoctor(Patient p) {
        doctorPatientList.add(p);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Doctor " +
                "name='" + name + '\'' +
                ", doctorSpeciality='" + doctorSpeciality + '\''
                ;
    }

    @Override
    public void showEmployeeDetails() {

    }
}