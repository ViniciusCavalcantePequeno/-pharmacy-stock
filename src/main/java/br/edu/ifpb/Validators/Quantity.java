package Validators;

public class Quantity{
    private int quantity;

    public Quantity validateQuantity(int quantity) {
        if (quantity < 5) {
            throw new 
        }
        if (quantity >= 5){
            quantity = this.quantity;
        }
    }

    public int getQuantitye() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}