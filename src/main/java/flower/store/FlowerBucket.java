package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private int price;
    private final List<FlowerPack> packs = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        this.packs.add(flowerPack);
    }
}
