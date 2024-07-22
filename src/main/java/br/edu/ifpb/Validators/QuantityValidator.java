package Validators;

import exceptions.QuantityDisabledException;

public class QuantityValidator{

    public boolean validateQuantity(int quantity) throws QuantityDisabledException {
        if (quantity < 0) {
            throw new QuantityDisabledException();
        } else {
            return true;
        }

    }
}