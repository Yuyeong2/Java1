package test211208;

import java.util.Scanner;

public class Test211213 {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        String id = "java", pw = "abc123";

        System.out.println("id를 입력해 주세요 >>> ");
        String inputId = input.nextLine();

        if (id.equals(inputId)) {
            System.out.println("ID가 일치합니다");
            System.out.println("패스워드를 입력해주세요");
            String inputPw = input.nextLine();
            if (pw.equals(inputPw)) {
                System.out.println("로그인 성공!");
            } else {
                System.out.println("패스워드가 일치하지 않음");
            }
        } else {
            System.out.println("아이디가 일치하지 않음");
        }*/
        //------------------------------------------------------------//
/*        Scanner input = new Scanner(System.in);
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 10:
                System.out.println("a = 10");
                break;
            default:
                System.out.println("일치하는 것이 없음");
        }*/
        //------------------------------------------------------------//
/*        Scanner input = new Scanner(System.in);
        System.out.println("정수1 입력 : ");
        int num1 = input.nextInt();
        System.out.println("정수2 입력 : ");
        int num2 = input.nextInt();
        System.out.println("정수3 입력 : ");
        int num3 = input.nextInt();
        int maxNum;
        if (num1 > num2) {
            if (num1 > num2 && num1 > num3) {
                maxNum = num1;
            } else if (num2 > num1 && num2 > num3) {
                maxNum = num2;
            } else {
                maxNum = num3;
            }
            System.out.println("가장 큰 수는 " + maxNum + "입니다.");*/
            //------------------------------------------------------------//
/*            System.out.println("임의의 정수를 입력하세요 >>");
            int number = input.nextInt();
            int result = number % 3;
            switch (result) {
                case 0:
                    System.out.println(number + "는 3의 배수입니다.");
                    break;
                default:
                    System.out.println(number + "는 3의 배수가 아닙니다.");
                    break;
            }*/
            //------------------------------------------------------------//
/*            Scanner input = new Scanner(System.in);
            System.out.println("국어 성적 입력 : ");
            int kor = input.nextInt();
            System.out.println("수학 성적 입력 : ");
            int math = input.nextInt();
            System.out.println("영어 성적 입력 : ");
            int eng = input.nextInt();
            double avg = (double) (kor + math + eng) / 3;
            System.out.printf("평균 점수 : %.1f \n", avg);

            if (avg >= 80) {
                System.out.println("등급 : A");
            } else if (avg >= 50) {
                System.out.println("등급 : B");
            } else if (avg >= 30) {
                System.out.println("등급 : C");
            } else {
                System.out.println("등급 : D");
            }*/
        //------------------------------------------------------------//
        int i = 1, j;
        while (i < 10) {
            j = 2;
            while(j < 10) {
                //System.out.print(j + "x" + i + "=" + i*j + "\t");
                System.out.printf("%dx%d=%d\t", j, i, j*i);
                j++;
            }
            System.out.println();
            i++;
        }
        //------------------------------------------------------------//
        int x = 1;
        while (x <= 100) {
            if(x % 3 == 0) {
                System.out.print(x + "\t");
                if (x % 5 == 0) {
                    System.out.println();
                }
            }
            x++;
        }
    }
}
