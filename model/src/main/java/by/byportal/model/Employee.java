package by.byportal.model;

import java.util.Date;
import java.util.List;

public class Employee {


    private int portalId = 0;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String jobPosition;
    private String workingAddress;
    private Integer age;
    private List<String> phoneNumbers;
    private byte availibility;


    public Employee() {
        System.out.println();
    }

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Employee(int portalId, String firstName, String lastName, String middleName, Date birthDate, String jobPosition, String workingAddress, Integer age, List<String> phoneNumbers, byte availibility) {
        this.portalId = portalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.jobPosition = jobPosition;
        this.workingAddress = workingAddress;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.availibility = availibility;
    }

    public int getPortalId() {
        return portalId;
    }

    public void setPortalId(int portalId) {
        this.portalId = portalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public byte getAvailibility() {
        return availibility;
    }

    public void setAvailibility(byte availibility) {
        this.availibility = availibility;
    }
}

