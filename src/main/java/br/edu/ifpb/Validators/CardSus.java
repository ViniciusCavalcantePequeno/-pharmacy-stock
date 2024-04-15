package Validators;

import Exceptions.CardSUSNotFoundException;

public class CardSUS {

private String cardSUS;

public String validateCardSus(String cardSUS) {
    try {
        if (cardSUS.length() == 19){
                return this.cardSUS = cardSUS;
            }
        } catch (CardSUSNotFoundException e) {
            return "Por favor, forneça a numeração da seguinte forma: xxx-xxxx-xxxx-xxxx";
        }
        return null;
    }
        public String getCardSUS() {
            return cardSUS;
        }
        
        public void setCardSUS(String cardSUS) {
            this.cardSUS = cardSUS;   
    }
}
    
