package org.example.class4;

public class LargestNumberV2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 399;

//        if (num1 > num2) {
//            if (num1 > num3){
//                System.out.println("Num1 is the largest number");
//            }
//        } else if (num2 > num3) {
//            if (num2>num1){
//                System.out.println("Num2 is the largest number");
//            }
//        } else if (num3 > num2){
//            if (num3 > num1){
//                System.out.println("Num3 is the largest number");
//            }
//        }

        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is largest "+num1);
            }else{
                System.out.println("num3 is largest "+num3);
            }
        }else{

            if(num2>num3){
                System.out.println("num2 is largest "+num2);
            }else{
                System.out.println("num3 is largest "+num3);
            }
        }
    }
}
