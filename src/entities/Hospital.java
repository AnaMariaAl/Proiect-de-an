package entities;


import entities.iterator.Iterable;
import entities.iterator.Iterator;




public class Hospital implements Iterable {

    Doctor o = new Doctor("Alex", "Surgeon");
    Doctor o1 = new Doctor("John", "Opthalmologist");
    Doctor o2 = new Doctor("David", "Otolaryngologist");



    private Doctor[] doctors = {o, o1, o2};


    String hospitalName;

    private static Hospital INSTANCE;



    private Hospital(String name) {
        this.hospitalName = name;
    }


    public static Hospital getInstance(String name) {
        if (INSTANCE == null)
            INSTANCE = new Hospital(name);
        return INSTANCE;
    }
    public Doctor[] getDoctors() {
        return doctors;
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

    }
}
