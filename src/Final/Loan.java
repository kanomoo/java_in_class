package Final;

public class Loan {
    private double price, interestRate;
    private int downPayment, mont;
    
    public Loan() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public int getMont() {
        return mont;
    }

    public void setMont(int mont) {
        this.mont = mont;
    }

    public String toCalculateReport() {
        return "";
    }
}