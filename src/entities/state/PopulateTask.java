package entities.state;

import entities.Doctor;
import entities.Hospital;
import entities.builder.Patient;
import entities.builder.PatientBuilder;
import entities.composite.DepartmentHead;
import entities.iterator.Iterator;

public class PopulateTask {
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
}
}