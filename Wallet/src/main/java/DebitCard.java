public class DebitCard extends PaymentCard implements IChargable{
    int accNumber;
    String sortCode;

    public DebitCard(int cardNumber, String expDate, int securityNumber, int accNumber, String sortCode){
        super(cardNumber, expDate, securityNumber);
        this.accNumber = accNumber;
        this.sortCode = sortCode;
    }

    public Transaction charge(double purchaseAmount){

    }
}
