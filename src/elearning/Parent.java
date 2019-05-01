package elearning;
import java.util.ArrayList;
import java.util.Objects;

public class Parent extends AuthorizedUser {
    String profession;
    ArrayList <CreditCard> creditCardList;
    
    public Parent() { 
        super(); 
    }
    
    public Parent(String profession, ArrayList<CreditCard> creditCardList, int id, String userName, String password, boolean status, String fullName, String email, String phone, String DateOfBirth, String address) {
        super(id, userName, password, status, fullName, email, phone, DateOfBirth, address);
        this.profession = profession;
        this.creditCardList = creditCardList;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public ArrayList<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(ArrayList<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
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
        final Parent other = (Parent) obj;
        if (!Objects.equals(this.profession, other.profession)) {
            return false;
        }
        if (!Objects.equals(this.creditCardList, other.creditCardList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parent{" + "profession=" + profession + ", creditCardList=" + creditCardList + '}';
    }

    
    
}
