package test;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("********第一个代码*********");
        Scanner sa = new Scanner(System.in);                        //从键盘获取数据，利用Scanner方法
        System.out.println("请随便输入一个数字：");
        float f0 = sa.nextFloat();
        System.out.println("刚才输入的数字是：" + f0);
        System.out.println("**************************");

        Scanner sb = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        float temp0 = 0;
        if(sb.hasNext()){
            temp0 = sb.nextFloat();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("输入第二个数字：");
        float temp1 = 0;
        if(sc.hasNext()){
            temp1 = sc.nextFloat();
        }
        sc.close();
        float f1 = temp0 +temp1;
        System.out.println("两数之和为："+ f1);

    }


}
