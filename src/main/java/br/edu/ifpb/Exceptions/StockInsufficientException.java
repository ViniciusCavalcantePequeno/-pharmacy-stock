public class StockInsufficientException extends RuntimeException {
    public StockInsufficientException() {
        super("Quantidade insuficiente no estoque!");
    }
}