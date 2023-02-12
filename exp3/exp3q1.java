package exp3;

import java.util.*;

public class exp3q1
{
    public static void main(String[] args)
    {
        //implicit casting
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("implicit casting: "+i+" to "+l+" to "+f);
        //explicit casting
        double d = 123.456;
        long l2 = (long)d;
        int i2 = (int)l2;
        System.out.println("explicit casting: "+d+" to "+l2+" to "+i2);
    }
}
