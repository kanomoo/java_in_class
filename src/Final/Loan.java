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
        double downAmount, financeAmount, interest, totalPayment, monthly;
        return "Price : " + price + "\nDown Payment : " + downPayment + "\nDown Payment Amount : " + (downAmount = price * (downPayment / 100.0)) + 
        "\nFinance Amount : " + (financeAmount = price - downAmount) + "\nInterest Rate : " + interestRate + 
        "\nMont : " + mont + "\nInterest : " + (interest = financeAmount * (interestRate / 12.0 / 100.0) * mont) +
        "\nTotal Payment : " + (totalPayment = financeAmount + interest) + "\nMonthly : " + (monthly = totalPayment / mont);
    }
}