package OOP4.factory;

import OOP4.FlowerBucket;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public class Factory {
    public FlowerBucket getBucket (BucketType type){
        if (type.equals(BucketType.WEDDING)) {
            return new WeddingBucket();
        }
        else if(type.equals(BucketType.BIRTHDAY)){
            return new BirthdayBucket();
        }
        else if(type.equals(BucketType.FUNERAL)){
            return new FuneralBucket();
        }
        else {
            System.out.println("We didn't find that specific bucket");
            return null;
        }
    }
}
