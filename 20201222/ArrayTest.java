package test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("**********20201222********");
        int [] a = new int[5];
        int temp;
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random() * 100);
            System.out.println("a第" + (i + 1) + "值是：" + a[i]);
        }
        for (int i = 0; i < (a.length)/2; i++) {
            temp = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("************反转之后的数组***************");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a第" + (i + 1) + "值是：" + a[i]);
        }


        System.out.println("************数组排序----选择排序***************");
        //选择法排序
        System.out.println("原数组为");
        int [] a0 = new int[]{21,2,34,5,54,6};
        int temp0;
        for (int i= 0;  i < a0.length; i++) {
            System.out.print(a0[i]+"\t");
        }
        System.out.println();
        System.out.println("选择排序后");
        for (int i = 0; i < a0.length; i++) {
            for (int j = 0; j < a0.length; j++) {
                if(a0[j]>a0[i]){
                    temp0 =a0[i];
                    a0[i]= a0[j];
                    a0[j]= temp0;
                }
            }
        }
        for (int i= 0;  i < a0.length; i++) {
            System.out.print(a0[i]+"\t");
        }

        //冒泡排序
        //a0[][]{21,2,34,5,54,6}
        System.out.println();
        System.out.println("冒泡排序后");
        int temp1;
        for (int i = 0; i < a0.length-1; i++) {
            for (int j = 0; j < a0.length-i-1; j++) {
                if(a0[j]>a0[j+1]){
                    temp1=a0[j];
                    a0[j]=a0[j+1];
                    a0[j+1]=temp1;
                }
            }
        }
        for (int i= 0;  i < a0.length; i++) {
            System.out.print(a0[i] + "\t");
        }


        //增强for循坏
        //a0[]
        System.out.println();
        System.out.println("增强for循环遍历数组");
        for(int num: a0){
            System.out.println(num);
        }
        //找到数组中最大值
        System.out.println("找到数组中最大值");
        int b[]=new int[]{21,4,54,6,9};
        int max=b[0];
        for(int item: b){
            System.out.println(item);
            if(item >max){
                max=item;
            }
        }
        System.out.println("最大数是："+max);


/*
        复制数组
        System.arraycopy(src, srcPos, dest, destPos, length)
        src: 源数组
        srcPos: 从源数组复制数据的起始位置
        dest: 目标数组
        destPos: 复制到目标数组的起始位置
        length: 复制的长度

 */
        System.out.println("复制数组");
        int c [] = new int[]{18,62,68,82,65,9};
        int d [] = new int[c.length];
        System.arraycopy(c, 0, d, 0, c.length);
        for(int item:c){
            System.out.println(item);
        }
        System.out.println("复制后");
        for(int item:d){
            System.out.println(item);
        }
        //数组合并，也可以用System.arraycopy(src, srcPos, dest, destPos, length)

       //二维数组
        int f[][]= new int[4][5];        //方式1
        f[1][1]=5;                      //指定位置赋值
        int g[][]=new int[2][];        //方式2
        int e[][]=new int[][]{        //方式3
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };


        //copyOfRange,toString(),sort,binarySearch,equals,fill
        int h[]=new int[]{18,62,68,82,65,9};
        int i[]=Arrays.copyOfRange(h,0,h.length);
        System.out.println("复制数组为：");
        System.out.println(Arrays.toString(i));
        System.out.println("排序前：");
        System.out.println(Arrays.toString(h));
        Arrays.sort(h);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(h));

        System.out.println("数字62出现的位置："+Arrays.binarySearch(h,62)); //搜索数组中元素所在位置
        System.out.println("数字6出现的位置："+Arrays.binarySearch(h,6));    //不存在输出-1

        System.out.println(Arrays.equals(i,h));       //h排序了所以不相等


    }
}
