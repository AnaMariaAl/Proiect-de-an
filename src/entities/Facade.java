package entities;

import entities.Doctor;
import entities.Hospital;
import entities.iterator.Iterator;

public class Facade {


        public void showDoctors (Hospital h1) {
            Iterator iterator = h1.getIterator();
            System.out.println("List of doctors : ");
            while (iterator.hasNext()) {

                Doctor doctor = (Doctor) iterator.next();
                System.out.println(doctor);
            }
        }
}
