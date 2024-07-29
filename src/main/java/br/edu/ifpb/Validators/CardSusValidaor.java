package Validators;

import exceptions.*;

public class CardSusValidaor extends Exception {

    public boolean validateCardSus(int cardSus) {
        if (cardSus < 15 || cardSus > 15) {
            throw new NamePatientDisabledException();
        } else {
            return true;
        }
        
   } 
}