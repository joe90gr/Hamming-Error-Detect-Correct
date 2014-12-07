package utils;

/**
 * Created with IntelliJ IDEA.
 * User: Joe90
 * Date: 01/12/14
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class OperationUtils {
    public static int setBit(int word, int pos){
        return word |= 1 << pos + 1;
    }
    public static int clearBit(int word, int pos){
        return word &= ~(1 << pos + 1);
    }
    public static int getBitValue(int word, int pos){
        return (word >> pos) & 1;
    }
}
