package test;

import java.util.Scanner;

public class CeShi {
    public static void main(String[] args) {
        System.out.println("************20201221**********");
        System.out.println("请输入工作的天数：");                     //第一天收入1，第二天收入2，第三天收入4，第四天收入8，以此类推，
        int count = 0;                                              //工作n天收入多少？
        Scanner s0 = new Scanner(System.in);
        int i0 = s0.nextInt();
        for (int i = 0; i < i0; i++) {
            count += (1 << i);
        }
        System.out.println(i0 + "天收入为：" + count);

        //continue用法
        System.out.println("*********************************");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;                                 //如果是偶数则不执行输出语句
            System.out.println(i);                        //打印10以内所有奇数
        }

        System.out.println("*********************************");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                continue;                                 //如果是3或5的倍数则不执行输出语句
            System.out.println(i);
        }

        System.out.println("*********************************");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (j % 2 == 0)
                    break;                                //break跳出本层for循环
            }
        }

        System.out.println("*********************************");
        boolean flag = false;                              //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (j % 20 == 0) {
                    flag = true;                          //终止外部循环的标记设置为true
                    break;
                }
            }
            if (flag)                                     //判断是否终止外部循环
                break;
        }

        System.out.println("******************黄金分割数**************");
        //黄金分割点---两数相除，结果离0.618最近,要求分子，分母不能同时为偶数，取值范围为[1,20]
        float min = 1f;
        float temp;
        float a = 1f;
        float b = 1f;
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    temp = Math.abs((float) i / (float) j - 0.618f);             //注意：i,j要转成float类型
                    if (temp < min) {
                        min = temp;
                        a = i;
                        b = j;
                    }
                }
            }
        }
        System.out.println(a + "\n" + b + "\n" + a / b);

        System.out.println("******************水仙花数**************");
        //一定是个三位数，每个数的立方加起来刚好是这个数本身。比如153
        //找出1000以内所有水仙花数
        for (int i = 100; i < 1000; i++) {
            int i3 = (i % 100) % 10;
            int i1 = (i / 10) % 10;
            int i2 = (i / 100) % 10;
            if (i3 * i3 * i3 + i1 * i1 * i1 + i2 * i2 * i2 != i)
                continue;
            System.out.println(i + "是水仙花数");
        }

        System.out.println("******************小学算数题**************");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 15; k++) {
                    for (int l = 0; l < 11; l++) {
                        if (i + j == 8 && i + k == 14 && k - l == 6 && j + l == 10) {
                            System.out.println(i + "+" + j + "=" + "8\n" + k + "-" + l + "=" + "6");
                        }
                    }
                }
            }
        }

        System.out.println("*****************数组****************");
        int[] a0;
        a0 = new int[5];
        int min0 = 999;
//        int [] a1 = new int[4];
        a0[0] = (int) (Math.random() * 100);
        a0[1] = (int) (Math.random() * 100);
        a0[2] = (int) (Math.random() * 100);
        a0[3] = (int) (Math.random() * 100);
        a0[4] = (int) (Math.random() * 100);
        for (int i = 0; i < a0.length; i++) {
            System.out.println("a0第" + (i + 1) + "值是：" + a0[i]);
            if (a0[i] < min0) {
                min0 = a0[i];
            }
        }
        System.out.println(min0);


    }
}
