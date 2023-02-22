package br.com.maratonajava.concorrencia.dominio;

public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code code;

    private Quote(String store, double price, Discount.Code code) {
        this.store = store;
        this.price = price;
        this.code = code;
    }

    public static Quote newQuote(String store) {
        String[] values = store.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", code=" + code +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getCode() {
        return code;
    }
}
