package com.dll.design.until;

import java.util.Scanner;

/**
 * @author dll
 * @date 2021-03-22 15:14
 */
public class TestUntil {
    //    public static void main(String[] args) {
//     //调用定义方法
//        System.out.println(isPalindrome(12321));
//    }

//    public static boolean isPalindrome(int x) {
//   //返回int参数的字符串表示形式
//        String str = String.valueOf(x);
//        //长度
//        int charSum = str.length();
//        for (int i = 0, j = charSum - 1; i < j; i++, j--) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPalindrome(int x) {
        if (x <0 || x%10==0 && x!=0){
            return false;
        }
        int ret = 0;
        while(x > ret){
            ret = ret*10+x%10;
            x = x/10;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }
}
