package test;

import java.util.Scanner;

public class BmI {
    public static void main(String[] args) {
        System.out.println("********20201220第一个代码*********");
        Scanner wight = new Scanner(System.in);                        //从键盘获取数据，利用Scanner方法
        System.out.println("请输入你的体重（单位：Kg）：");
        float f0 = wight.nextFloat();

        Scanner high = new Scanner(System.in);                        //从键盘获取数据，利用Scanner方法
        System.out.println("请输入你的身高（单位：米）：");
        float f1 = high.nextFloat();
        float f2 = f0/(f1 * f1);

        System.out.println("你的BMI指数是：" + f2);
        System.out.println("**************************");
    }
}
