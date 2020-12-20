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

        if(f2<18.5){
            System.out.println("体重过轻");
        }else if(f2>=18.5 && f2<24){
            System.out.println("正常范围");
        }else if(f2>=24 && f2<27) {
            System.out.println("体重过重");
        }else if(f2>=27 && f2<30){
                System.out.println("轻度肥胖");
        }else if(f2>=30 && f2<35){
            System.out.println("中度肥胖");
        }else if(f2>=35 ) {
            System.out.println("重度肥胖");
        }

    }
}
