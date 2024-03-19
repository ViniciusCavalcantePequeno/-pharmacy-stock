package DAO;

public class CardSus {
    private int cardSus;

    public CardSus validateCardSus(int cardSus) {
        if (cardSus < 15) {
            throw new 
        }
        if (cardSus > 15){
            throw new;
        }
        if (cardSus == 15){
            this.cardSus = cardSus;
        }
}

    public int getCardSus() {
        return cardSus;
    }

    public void setCardSus(int cardSus) {
        this.cardSus = cardSus;
    }
}