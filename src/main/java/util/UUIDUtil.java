package util;

public class UUIDUtil {

    //随机数生成的区间在 80-100 之间
    public static Double generateRandom() {
        double min = 80;
        double max = 100;
        Double result = min + (Double)(Math.random() * ((max - min) + 1));
        return result;
    }
}
