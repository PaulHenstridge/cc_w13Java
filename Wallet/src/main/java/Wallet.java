import java.util.ArrayList;

public class Wallet {
    ArrayList<IChargable> cards;
    IChargable selectedCard;
    ArrayList<Transaction> transactionHistory;

    public Wallet(){
        this.cards = new ArrayList<IChargable>();
        this.selectedCard = null;
        this.transactionHistory = new ArrayList<Transaction>();
    }

    public void addCard(IChargable newCard){
        this.cards.add(newCard);
    }

    public void selectCard(int index){
        IChargable chosenCard = this.cards.get(index);
        this.setSelectedCard(chosenCard);
    }

    public void setSelectedCard(IChargable selectedCard) {
        this.selectedCard = selectedCard;
    }

    public void pay(double purchaseAmount){
        Transaction transaction = this.selectedCard.charge(purchaseAmount);
        if (!(transaction.card instanceof GiftCard)){
            this.transactionHistory.add(transaction);
        }
    }
}
