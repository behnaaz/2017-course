package salary;

public class SalaryCalculator {

    public double calculate(Employee employee) {
        if(Role.DEVELOPER.equals(employee.getRole())) {
            return tenOrTwentyPercent(employee);
        }

        if(Role.DBA.equals(employee.getRole()) || Role.TESTER.equals(employee.getRole())) {
            return fifteenOrTwentyFivePercent(employee);
        }

        throw new RuntimeException("invalid employee");
    }

    private double tenOrTwentyPercent(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.8;
        }
        else {
            return employee.getBaseSalary() * 0.9;
        }
    }

    private double fifteenOrTwentyFivePercent(Employee employee) {
        if(employee.getBaseSalary() > 2000.0) {
            return employee.getBaseSalary() * 0.75;
        }
        else {
            return employee.getBaseSalary() * 0.85;
        }
    }
}
