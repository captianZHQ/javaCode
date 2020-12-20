package test;

import java.util.Scanner;

public class LuoJi {
    public static void main(String[] args) {
        System.out.println("********20201220第三个代码*********");
        int i0 = 5;
        String s0 = Integer.toBinaryString(i0);
        System.out.println(i0 + "的二进制表达式为：" + s0);

        int i = 5;
        int j = 6;
        System.out.println(i | j);
        System.out.println(i & j);
        System.out.println(i ^ j);
        System.out.println(~i);   //  0000 0101  ---->  1111 1010

        //计算2*16,不用*符号
        int i1 = 2;
        int i2 = i1 << 4;             //16 = 2的4次方，左移四位
        System.out.println(i2);

        i = 1;
        i += ++i;
        System.out.println(i);

        //三元操作符

        Scanner s5 = new Scanner(System.in);
        System.out.println("今天是周几（输入1-7）：");
        int i3 = s5.nextInt();
        String s1 = "工作日";
        String s2 = "休息日";
        String s3 = i3 > 5 ? s2 : s1;
        System.out.println(s3);

        //Scanner 读取字符串
        Scanner s6 = new Scanner(System.in);
        System.out.println("随便输入：");
        String s4 = s6.nextLine();
        s6.close();
        System.out.println("输入的字符串是："+s4);



    }
}
