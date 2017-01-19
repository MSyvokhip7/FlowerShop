package OOP4.factory;

import OOP4.FlowerBucket;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.spec.FlowerSpec;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public class FuneralBucket extends FlowerBucket {

    public FuneralBucket() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec num1 = new FlowerSpec(FlowerType.ROSE, FlowerColor.RED);
        num1.setPrice(10);
        num1.setLength(2);

        FlowerSpec num2 = new FlowerSpec(FlowerType.ROMASHKA, FlowerColor.WHITE);
        num2.setPrice(15);
        num2.setLength(4);

        FlowerSpec num3 = new FlowerSpec(FlowerType.MAK, FlowerColor.BLUE);
        num3.setPrice(22);
        num3.setLength(5);

        FlowerSpec num4 = new FlowerSpec(FlowerType.ROSE, FlowerColor.RED);
        num4.setPrice(10);
        num4.setLength(2);

        FlowerSpec num5 = new FlowerSpec(FlowerType.ROMASHKA, FlowerColor.WHITE);
        num5.setPrice(15);
        num5.setLength(4);

        FlowerSpec num6 = new FlowerSpec(FlowerType.MAK, FlowerColor.BLUE);
        num6.setPrice(22);
        num6.setLength(5);

        FlowerSpec num7 = new FlowerSpec(FlowerType.ROSE, FlowerColor.RED);
        num7.setPrice(10);
        num7.setLength(2);

        FlowerSpec num8 = new FlowerSpec(FlowerType.ROMASHKA, FlowerColor.WHITE);
        num8.setPrice(15);
        num8.setLength(4);

        FlowerSpec num9 = new FlowerSpec(FlowerType.MAK, FlowerColor.BLUE);
        num9.setPrice(22);
        num9.setLength(5);

        bucket.addFlower(num1);
        bucket.addFlower(num2);
        bucket.addFlower(num3);
        bucket.addFlower(num4);
        bucket.addFlower(num5);
        bucket.addFlower(num6);
        bucket.addFlower(num7);
        bucket.addFlower(num8);
        bucket.addFlower(num9);
    }

    public String getDescription() {
        return "Funeral Bucket";
    }
}
