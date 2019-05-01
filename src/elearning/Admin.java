package elearning;

public class Admin extends Person {
    Admin adminInstance;
    String userName;
    String password;
    float salary;

    public Admin(Admin adminInstance, String userName, String password, float salary, String fullName, String email, String phone, String DateOfBirth, String address) {
        super(fullName, email, phone, DateOfBirth, address);
        this.adminInstance = adminInstance;
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }

    public Admin getAdminInstance() {
        return adminInstance;
    }

    public void setAdminInstance(Admin adminInstance) {
        this.adminInstance = adminInstance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
