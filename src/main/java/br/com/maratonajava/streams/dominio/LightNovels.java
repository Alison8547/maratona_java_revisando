package br.com.maratonajava.streams.dominio;

public class LightNovels {
    private String title;
    private Double price;

    public LightNovels(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovels{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
