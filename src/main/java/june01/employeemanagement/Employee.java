package june01.employeemanagement;

import java.util.List;
import java.util.Map;

public class Employee {

    private int empId;
    private String firstName ;
    private String lastName ;
    private List<String> phoneNumbers;
    private Map<String,String> employmentHistory;


    public Employee() {

    };

    public Employee(int empId, String firstName, String lastName, List<String> phoneNumbers, Map<String, String> employmentHistory) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.employmentHistory = employmentHistory;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Map<String, String> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setEmploymentHistory(Map<String, String> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    @Override
    public String toString() {
        return "Employee " +
                "\nempId=" + empId +
                ", \nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nphoneNumbers=" + phoneNumbers +
                ", \nemploymentHistory=" + employmentHistory +
                '}';
    }
}
