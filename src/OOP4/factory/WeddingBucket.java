package OOP4.factory;

import OOP4.FlowerBucket;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.spec.FlowerSpec;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public class WeddingBucket extends FlowerBucket {
    public WeddingBucket() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec num1 = new FlowerSpec(FlowerType.TULIP, FlowerColor.GREEN);
        num1.setPrice(10);
        num1.setLength(1);

        FlowerSpec num2 = new FlowerSpec(FlowerType.TULIP, FlowerColor.WHITE);
        num2.setPrice(10);
        num2.setLength(1);

        FlowerSpec num3 = new FlowerSpec(FlowerType.TULIP, FlowerColor.WHITE);
        num3.setPrice(10);
        num3.setLength(1);

        FlowerSpec num4 = new FlowerSpec(FlowerType.TULIP, FlowerColor.WHITE);
        num4.setPrice(10);
        num4.setLength(1);

        FlowerSpec num5 = new FlowerSpec(FlowerType.TULIP, FlowerColor.GREEN);
        num5.setPrice(10);
        num5.setLength(1);

        bucket.addFlower(num1);
        bucket.addFlower(num2);
        bucket.addFlower(num3);
        bucket.addFlower(num4);
        bucket.addFlower(num5);
    }

    public String getDescription() {
        return "Wedding Bucket";
    }
}
