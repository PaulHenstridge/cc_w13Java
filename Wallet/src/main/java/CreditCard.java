public class CreditCard extends PaymentCard implements IChargable{
    int availableCredit;

    public CreditCard(int cardNumber, String expDate, int securityNumber, int availableCredit){
        super(cardNumber, expDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public Transaction charge(double purchaseAmount){
        Transaction newTransaction = new Transaction(this, purchaseAmount);
        return newTransaction;
    }
}
