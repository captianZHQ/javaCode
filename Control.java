package test;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        //if
        System.out.println("************查询是否是闰年**********");
        System.out.println("请输入要查询的年份");
        Scanner s0 = new Scanner(System.in);
        int i0 = s0.nextInt();
//        s0.close();
        if (i0 % 4 == 0) {
            System.out.println(i0 + "是闰年");
        } else {
            System.out.println(i0 + "不是闰年");
        }

        //switch可以使用byte, short , char, String（java1.7开始支持，编译后还是将其转换为hash值，还是整数）, enum（枚举类型）
        //注意 break；
        System.out.println("输入查询的月份");
        Scanner s1 = new Scanner(System.in);
        int i1 = s1.nextInt();
        switch (i1) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
        }
//        s1.close();


        //while  求n的阶乘
       // 方式一：
        System.out.println("**********方法一*********");
        System.out.println("输入一个正整数");
        Scanner s2 = new Scanner(System.in);
        int i2 = s1.nextInt();
        long l0=1;
        int i3=i2;
        if(i3==1){
            System.out.println(i2+"的阶乘是"+i2);
        }else {
            while (i3 > 1) {
                l0 = l0 * i3 * (--i3);
                i3--;
            }
            System.out.println(i2+"的阶乘是"+l0);
        }


        System.out.println("**********方法二*********");
        long l1=1;
        int i4=i2;
        while(i4>0){
            l1=l1*i4--;
        }
        System.out.println(i2+"的阶乘是"+l1);


    }

}
