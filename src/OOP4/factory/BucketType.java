package OOP4.factory;

/**
 * Created by TheOriginMS7 on 11.01.2017.
 */
public enum BucketType {
    FUNERAL, BIRTHDAY, WEDDING;
    public String toString(){
        switch(this){
            case FUNERAL:
                return "Funeral";
            case BIRTHDAY:
                return "Birthday";
            case WEDDING:
                return "Wedding";
            default:
                return "";
        }
    }
}
