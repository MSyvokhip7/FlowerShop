package OOP4.suppliers;

import OOP4.FlowerBucket;
import OOP4.Item;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Flower;
import OOP4.spec.FlowerSpec;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public class TulipSuppplier implements Observer {

    @Override
    public void update(Observable s, Object items) {
        LinkedList<Item> item = (LinkedList<Item>) items;
        for (Item it: item){
            FlowerBucket bucket = (FlowerBucket) it;
            FlowerSpec num = new FlowerSpec(FlowerType.TULIP, FlowerColor.WHITE);
            System.out.println("Sent request " + bucket.searchFlower(num).size() + " tulips");
        }
    }
}
