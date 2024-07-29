package Validators;

import exceptions.*;

public class QuantityValidator{

    public boolean validateQuantity(int quantity) {
        if (quantity < 0) {
            throw new QuantityDisabledException();
        } else {
            return true;
        }

    }
}