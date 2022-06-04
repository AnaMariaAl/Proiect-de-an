package entities;

import entities.composite.Employee;

public class Nurse  implements Employee {
    private String name;
    private String address;
    private int id;


    public Nurse(String name, String address, int id){
        this.name = name;
        this.address = address;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void showEmployeeDetails() {

    }
}
