package com.company;
import java.util.Scanner;
public class RECURSION {
    public static void main(String []args){
        Scanner input = new Scanner(System.in); //构建一个输入实例
        int n = input.nextInt();                //输入n的值
        Boolean flag =true;
        if(n<0){
            System.out.println("输入数据有误");
            flag = false;
        }

        if(flag == true){
            System.out.println(" n! is " + factorial(n));       //    n的阶乘的值为：factorial(n);                //用递归函数求解n的阶乘
        }
    }

    public static int factorial(int n){//阶乘求解函数
        if(n == 0){                             //判断传进来的n是否为0，若为零返回阶乘为1
            return 1;
        }
        return n*factorial(n-1);             //重新调用函数，继续判断n-1是否为零，
    }                                          //若不为0则return值为n*(n-1)*factorial(n-1-1),直到n=0，跳出函数
}
// 输入20结果显示为负数