package elearning;

public class Fees {
    
    Payment paymentMethod;

    public Fees(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void checkout() {
        
    }
}
