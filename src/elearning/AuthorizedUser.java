package elearning;
import java.util.Objects;

public class AuthorizedUser extends Person {
    int id;
    String userName;
    String password;
    boolean status;
 
    public AuthorizedUser() {
        super();
    }
    public AuthorizedUser(int id, String userName, String password, boolean status, String fullName, String email, String phone, String DateOfBirth, String address) {
        super(fullName, email, phone, DateOfBirth, address);
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuthorizedUser other = (AuthorizedUser) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AuthorizedUser{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", status=" + status + '}';
    }
    
    
}
