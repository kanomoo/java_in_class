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
        String output = "";
        double downAmount, financeAmount, interest, totalPayment, monthly;
        output += "Price : " + price + "\nDown Payment : " + downPayment + "\nDown Payment Amount : " + String.format("%.2f", (downAmount = price * (downPayment / 100.0))) ;
        output += "\nFinance Amount : " + (financeAmount = price - downAmount) + "\nInterest Rate : " + interestRate;
        output += "\nMont : " + mont + "\nInterest : " + String.format("%.2f", (interest = financeAmount * (interestRate / 12.0 / 100.0) * mont)) ;
        totalPayment = financeAmount + interest;
        monthly = totalPayment / mont;
        output += "\nTotal Payment : " + String.format("%.2f", totalPayment) + "\nMonthly : " + String.format("%.2f", monthly);
        return output;
    }
}