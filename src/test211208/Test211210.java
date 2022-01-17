package test211208;

import java.util.Scanner;

public class Test211210 {
    public static void main(String[] args) {
/*        //----------------------------예제1----------------------------//
        int num1 = 150;
        int num2 = 240;
        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiple = num1 * num2;
        double divide = (double)num1 / num2;
        System.out.println(num1 + " + " + num2 + " = " + plus);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + multiple);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        //----------------------------예제2----------------------------//
        boolean result = (num2*num2*num2) / num1 > 10;
        System.out.println(result);
        //----------------------------예제3----------------------------//
        int x = 2;
        int i = (7*x*x*x) - (9*x) - 2;
        System.out.println("f(" + x + ") = " + i);*/
        //------------------------------------------------------------//
/*        Scanner input = new Scanner(System.in);
        System.out.println("문장을 입력하세요. >>");
        String b = input.nextLine();
        String a = input.next();

        System.out.println("next : " + a);
        System.out.println("nextLine : " + b);*/
        //------------------------------------------------------------//
/*        Scanner input = new Scanner(System.in);
        String a = "\t"; // \n : 줄바꿈 , \t :탭

        System.out.printf("test%d %.2fnum", 3, 3.141414);
        System.out.print("test2");*/
        //----------------------------예제1----------------------------//
        Scanner input = new Scanner(System.in);
        System.out.println("가로 길이를 입력하세요 >>");
        int width = input.nextInt();
        System.out.println("가로 길이를 입력하세요 >>");
        int height = input.nextInt();
        int around = (width + height) * 2;
        int square = width * height;
        System.out.println("직사각형의 둘레 = " + around);
        System.out.println("직사각형의 넓이 = " + square);
        //----------------------------예제2----------------------------//
        System.out.println("num1 입력: ");
        int num1 =input.nextInt();
        System.out.println("num2 입력: ");
        int num2 = input.nextInt();
        int result2 = (num1 << 2) + num2;
        System.out.println("결과 : " + result2);
        //----------------------------예제3----------------------------//
        System.out.println("숫자를 입력하세요 >>>");
        int x = input.nextInt();
        boolean result3 = x % 2 == 0;
        //result3 = x % 2 == 0 ? true : false;
        System.out.println( x + "은 " + result3 + "입니다.");
    }
}
