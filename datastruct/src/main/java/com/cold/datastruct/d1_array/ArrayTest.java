package com.cold.datastruct.d1_array;

/**
 * java数组相关的使用和测试
 */
public class ArrayTest {


    public static void main(String[] args) {
//        define();
//        init1();
//        init3();
        copy();
    }

    /**
     * 数组对象的创建
     */
    private static void define() {
        int arr[];
        arr = new int[10];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = i;
            System.out.println("===============> arr[" + i + "]" + arr[i]);
        }
    }

    /**
     * 数组静态初始化
     */
    private static void init1() {
        int arr[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i ++){
            arr[i] = i;
            System.out.println("===============> arr[" + i + "]" + arr[i]);
        }
    }


    /**
     * 数组动态态初始化
     */
    private static void init2() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 0; i < arr.length; i ++){
            arr[i] = i;
            System.out.println("===============> arr[" + i + "]: " + arr[i]);
        }
    }


    /**
     * 数组初始化
     */
    private static void init3() {
        int[] arr = new int[5];
        User[] user = new User[5];
        System.out.println(arr[1]);
        System.out.println(user[1]);
    }

    /**
     * 基本类型和包装类型
     */
    private static void test() {
        Integer i = 5;
        int a = i.intValue();
        Integer b = Integer.valueOf(a);
    }

    /**
     * 二维数组
     */
    private static void testTwoArray() {
//        int arr[][] = {{1, 2}, {3, 4}};

        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
    }

    /**
     * 数组拷贝
     */
    private static void copy() {
        int[] a = {1, 2, 3};
        int[] b = new int[5];
        System.arraycopy(a,0, b,0, a.length);
        for(int i = 0; i < b.length; i ++){
            System.out.println("===============> b[" + i + "]: " + b[i]);
        }
    }


}

class User {

    String name;
    String sex;

    public User(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
}





