package entities.composite;

import java.util.LinkedList;
import java.util.List;

public class DepartmentHead implements Employee{

     private String name;
     private  String nameOfSection;

     private List<Employee> employeeList = new LinkedList<>();

     public DepartmentHead(String name, String nameOfSection) {
         this.name = name;
         this.nameOfSection =nameOfSection;
     }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employees working under :" + name);
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    public void  addEmployee(Employee employee) {
         employeeList.add(employee);
    }
    public  void removeEmployee(Employee employee) {
         employeeList.remove(employee);
    }
}
