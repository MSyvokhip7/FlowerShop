package OOP4.factory;

import OOP4.FlowerBucket;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.spec.FlowerSpec;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public class BirthdayBucket extends FlowerBucket {
    public BirthdayBucket() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec num1 = new FlowerSpec(FlowerType.CACTUS, FlowerColor.GREEN);
        num1.setPrice(45);
        num1.setLength(6);

        FlowerSpec num2 = new FlowerSpec(FlowerType.CACTUS, FlowerColor.GREEN);
        num2.setPrice(45);
        num2.setLength(6);

        FlowerSpec num3 = new FlowerSpec(FlowerType.CACTUS, FlowerColor.GREEN);
        num3.setPrice(45);
        num3.setLength(6);


        bucket.addFlower(num1);
        bucket.addFlower(num2);
        bucket.addFlower(num3);

    }

    public String getDescription() {
        return "Birthday Bucket";
    }
}
