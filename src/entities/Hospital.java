package entities;

import entities.builder.Patient;
import entities.iterator.Iterable;
import entities.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;


public class Hospital implements Iterable {
    Doctor o = new Doctor("Alex", "Surgeon");
    Doctor o1 = new Doctor("John", "Opthalmologist");
    Doctor o2 = new Doctor("David", "Otolaryngologist");
    private Doctor[] doctors = {o, o1, o2};

    List<Doctor> doctorList = new ArrayList<Doctor>();
    List<Patient> patientList = new ArrayList<Patient>();
    String hospitalName;

    private static Hospital INSTANCE;

    void addDoctor(Doctor d) {
        doctorList.add(d);

    }

    void addPatient(Patient p) {
        patientList.add(p);
    }

    private Hospital(String name) {
        this.hospitalName = name;
    }

    public List<Doctor> showDoctors() {
        return doctorList;
    }

    public List<Patient> showPatients() {
        return patientList;
    }

    public static Hospital getInstance(String name) {
        if (INSTANCE == null)
            INSTANCE = new Hospital(name);
        return INSTANCE;
    }
    public Iterator getIterator() {
        return new DoctorIterator();
    }

    private class DoctorIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < doctors.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return doctors[index++];
            }
            return null;
        }

        public void assignDoctor() {
            for (Patient x : patientList) {
                for (Doctor y : doctorList) {
                    if (x.getDiagnostic().equals("eye")) {
                        if (y.getDoctorSpeciality().equals("Opthalmologist")) {
                            y.addPatientsToDoctor(x);
                        }
                    }
                    if (x.getDiagnostic().equals("heart")) {
                        if (y.getDoctorSpeciality().equals("Surgeon")) {
                            y.addPatientsToDoctor(x);
                        }
                    }
                    if (x.getDiagnostic().equals("earnose")) {
                        if (y.getDoctorSpeciality().equals("Otolaryngologist")) {
                            y.addPatientsToDoctor(x);
                        }
                    }

                }
            }

        }
    }
}
