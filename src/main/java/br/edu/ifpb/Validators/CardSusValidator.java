package Validators;

import exceptions.NamePatientDisabledException;

public class CardSusValidaor {

    public boolean validateCardSus(int cardSus) {
        if (cardSus < 15 || cardSus > 15) {
            throw new NamePatientDisabledException();
        } else {
            return true;
        }
        
   } 
}