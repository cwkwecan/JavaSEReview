package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-19 15:03
 */
public class ArrayTest1 {

    //面试题目：创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        //方式一：
//        int[] arr = new int[6];
//        int count = 0;//记录有效的随机数的个数
//        while (count < arr.length) {
//            boolean flag = true;//用来标志的变量
//            int num = (int) (Math.random() * 30 + 1);
//            for (int i = 0; i < arr.length; i++) {
//                if (num == arr[i]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                arr[count] = num;
//                count++;
//            }
//        }

        //方式二：
//        int[] arr = new int[6];
//		for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
//			arr[i] = (int) (Math.random() * 30) + 1;
//			boolean flag = false;
//			while (true) {
//				for (int j = 0; j < i; j++) {
//					if (arr[i] == arr[j]) {
//						flag = true;
//						break;
//					}
//				}
//				if (flag) {
//					arr[i] = (int) (Math.random() * 30) + 1;
//					flag = false;
//					continue;
//				}
//				break;
//			}
//		}

//        //方式三：这谁想出来的，太牛了
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            //[0.0,1.0) * 30 = [0.0,30.0) + 1 = [1.0,31.0) -> 取整 = [1,30]
            arr[i] = (int)(Math.random() * 30 + 1);

            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        long end = System.currentTimeMillis();

        System.out.println("消耗的时间为：" + (end - start));
    }
}
