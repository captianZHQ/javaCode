package test;

import java.util.ArrayList;
import java.util.*;

public class ZhiShu {
    public static void main(String[] args) {
        int i, j,k;
        ArrayList list = new ArrayList();
        for (i = 2; i < 100; i++) {
            for (j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
//                System.out.printf("%d\t", i);
                list.add(i);
                System.out.println(list);
//                int item = (Integer) list.get(0); //自动拆箱
            }
        }
        //list转化为数组
      Integer a[] =new Integer[list.size()];
         list.toArray(a);
        System.out.println(Arrays.toString(a));
        //100以内的数写成两个质数之和
        for (int l = 2; l <=100 ; l++) {
            for (int m = 0; m < a.length; m++) {
                for (int n = 0; n < a.length; n++) {
                    if(l==a[m]+a[n])
                        System.out.println(l+"="+a[m]+"+"+a[n]);
                }
            }
        }






    }
}