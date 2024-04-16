package Validators;

import Exceptions.QuantityDisabledException;

public class Quantity {

    private int quantity;

    public int validadeQuantity(int quantity) {
        try {
            if (quantity >= 5) {
                return quantity = this.quantity;
            }
        } catch (QuantityDisabledException e) {
            return -1;
        }
        return 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
