package flower.store;

public class Flower {
    private FlowerColor color;
    private int price;
    private int sepalLength;

    public Flower() {}

    public Flower(FlowerColor color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }

    public Flower(FlowerColor color, int price) {
        this.color = color;
        this.price = price;
    }

    public int getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(int sepalLength) {
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return this.color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
