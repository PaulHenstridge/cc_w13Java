public class Transaction {
    IChargable card;
    double amount;
    double fee;
    double totalAmount;

    public Transaction(IChargable card, double amount){
        this.card = card;
        this.amount = amount;
    }

    public double calculateFee(){
        return this.amount * 0.05;
    }

    public void calculateTotal(){
        this.totalAmount = this.amount + this.calculateFee();
    }
}

