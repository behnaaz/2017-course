package salary;


import java.util.Calendar;

public class Employee {

    private int id;
    private String name;
    private Role role;
    private Calendar admissionDate;
    private double baseSalary;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Role getRole() {
        return role;
    }
    public Calendar getAdmissionDate() {
        return admissionDate;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public void setAdmissionDate(Calendar admissionDate) {
        this.admissionDate = admissionDate;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
