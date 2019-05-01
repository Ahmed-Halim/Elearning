package elearning;

import java.util.Objects;

public class CreditCard {
    int id;
    String cardNumber;
    String expiredDate;
    String cvv;
    CardType cardType;

    public CreditCard(int id, String cardNumber, String expiredDate, String cvv, CardType cardType) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
        this.cvv = cvv;
        this.cardType = cardType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
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
        final CreditCard other = (CreditCard) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cardNumber, other.cardNumber)) {
            return false;
        }
        if (!Objects.equals(this.expiredDate, other.expiredDate)) {
            return false;
        }
        if (!Objects.equals(this.cvv, other.cvv)) {
            return false;
        }
        if (this.cardType != other.cardType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "id=" + id + ", cardNumber=" + cardNumber + ", expiredDate=" + expiredDate + ", cvv=" + cvv + ", cardType=" + cardType + '}';
    }
    
    
    
}
