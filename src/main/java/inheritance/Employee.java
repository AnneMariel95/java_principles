package inheritance;

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee(){
//        super("Mariel");
        System.out.println("In Employee default constructor");
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getTitle() {
        return title;
    }
}
