/**
 * Created with IntelliJ IDEA.
 * User: Joe90
 * Date: 30/11/14
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */

import EncDec.HammingEncoder;
import utils.OperationUtils;


public class main {
    public static void main(String []args){


        HammingEncoder hammingEncoder = new HammingEncoder();
        //String d = "01101100101";
        String d = "111111111111";
        //String d = "1011101011101110";
        String encoded = hammingEncoder.encodeDecodeWord(d,true);
        System.out.println("PURE  : "+d);
        System.out.println("Before: "+encoded);
        //String encodedError = "010011001100111";
        //String encodedError = "10100111101011100111001111001110";
        //String encodedError = encoded;
        String encodedError = "11101100111101111";
        System.out.println("ERROR : "+encodedError);

        String afterErr = hammingEncoder.encodeDecodeWord(encodedError,false);
        System.out.println( "Syndrome: "+hammingEncoder.getSyndrome() );
        System.out.println("After : "+afterErr);
    }

}
