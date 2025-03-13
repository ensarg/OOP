package tr.edu.maltepe.oop;

public class Employee {

    private int tckn;
    private String empName;
    private int empAge;

    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 75;

    // Getter and Setter methods
    public int getTckn() {
        return tckn;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newValue) {
        if (newValue >= MIN_AGE && newValue <= MAX_AGE) {
            empAge = newValue;
        } else {
            throw new IllegalArgumentException("Age must be between " + MIN_AGE + " and " + MAX_AGE + ".");
        }
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmptckn(int newValue) {
        tckn = newValue;
    }
}
