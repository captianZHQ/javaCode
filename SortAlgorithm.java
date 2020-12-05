package com.company;

/**
 * 冒泡排序
 *
 * @param
 * @return
 */
//public class SortAlgorithm {
//    public static void main(String[] args) {
//        int[] arr = {5, 4, 7, 9, 3};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
////                if (arr[j] > arr[j + 1]) {               //从小得到大排序
//                if (arr[j] < arr[j + 1]) {               //从大到小排序
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//
//}

/**
 * 快速排序
 *
 * @param
 * @return
 */
public class SortAlgorithm {
    public static void main(String[] args) {
        int []arr={7,5,85,8,25,9,3,4,15};
        //调用方法，进行快速排序
        QuickSort(arr, 0, arr.length-1);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //定义方法，用来进行快速排序
    public static void QuickSort(int []arr,int left,int right){
        /*
         * 进行判断，如果左边索引比右边索引大，是不合法的，直接使用return结束这个方法
         */
        if (left>right) {
            return;
        }
        //定义变量保存基准数
        int base=arr[left];
        //定义变量i，指向最左边
        int i=left;
        //定义变量j，指向最右边
        int j=right;
        //当i与j不相遇的时候，在循环中检索
        while(i!=j){
            //先由j从右往左检索比基准数小的，如果检索到比基准数小的就停下
            //如果检索到比基准数大的或者相等的，就继续检索
            while(arr[j]>=base && i<j)
                j--;//j从右往左移动
            //i从左往右检索
            while (arr[i]<=base && i<j)
                i++;//i从左往右移动
            //当i和j都停下的时候，然后交换i和j位置的元素
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //当上面循环条件不成立，也就是i==j，会跳出这个循环，i和j相遇，就把交换基准数这个元素和相遇位置的元素
        //把相遇位置的元素赋值给基准数这个位置的元素
        arr[left]=arr[i];
        //把基准数赋值给相遇位置的元素
        arr[i]=base;
        //基准数在这里就归为了，左边的数比它小，右边的数比它大
        //递归调用自身，排基准数左边
        QuickSort(arr, left, i-1);
        //排基准数右边
        QuickSort(arr, j+1, right);
    }
}













//选择排序

//插入排序
//希尔排序
//归并排序

//堆排序
//计数排序
//桶排序
//基数排序
