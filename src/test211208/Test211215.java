package test211208;

import java.util.Random;
import java.util.Scanner;

public class Test211215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //------------------------------------------------------------//
/*        System.out.println("숫자 1을 입력하세요 >>");
        int n = input.nextInt();
        System.out.println("숫자 2을 입력하세요 >>");
        int m = input.nextInt();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
            System.out.print("*");
            }
            System.out.println();
        }*/
        //------------------------------------------------------------//
/*        System.out.println("정수 입력 >>");
        int number = input.nextInt();
        int x = 1;
        for(int i = 1; i <= number; i++) {
            x *= i;
        }
        System.out.printf("%d! = %d 입니다.\n", number, x);*/
        //------------------------------------------------------------//
/*        System.out.println("정수 입력 >>");
        int z = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= z; i++) {
            if(z % i == 0) {
                sum += i;
            }
        }
        System.out.printf("%d의 약수의 합은 %d입니다.", z, sum);*/
        //------------------------------------------------------------//
/*        String[] s = {"Life", "is", "too", "short"};
        String ss = "";
        for(int i = 0; i < s.length; i++) {
            ss += s[i] + " ";
        }
        System.out.println(ss);*/
        //------------------------------------------------------------//
/*        int[] score = new int[3];
        int failCount = 0;
        int num;

        for (int i = 0; i < score.length; i++) {
        Random random = new Random();
        int randomNum = random.nextInt(5) + 1;
            score[i] = randomNum;
            System.out.println(score[i]);
        }
        for(int i = 0; i < score.length; i++) {
            while (i <= score.length) {
                if (failCount == score.length) {
                    System.out.printf("실패! 숫자는 %d, %d, %d 입니다", score[0], score[1], score[2]);
                    break;
                } else if(i == score.length) {
                    System.out.println("성공!");
                    break;
                } else if(i < score.length) {
                    System.out.print("맞출 숫자를 입력하세요 : ");
                    num = input.nextInt();
                    if (num != score[i]) {
                        failCount++;
                        System.out.println("틀렸습니다 남은 기회 : " + (score.length - failCount));
                    } else {
                        System.out.println("맞았습니다. 다음 숫자를 입력하세요.");
                        i++;
                    }
                }
            }
        }*/
        //------------------------------------------------------------//
        int[] randArray = new int[3];
        Random random = new Random();

        System.out.println("랜덤 숫자를 생성합니다.");
        for(int i = 0; i < randArray.length; i++) {
            int randomInt = random.nextInt(5) + 1;
            randArray[i] = randomInt;
            //   System.out.println(randArray[i]);
        }

        int sum = 0;

        for(int i = 0; i < randArray.length; i++) {
            //  System.out.println("현재 맞춰야 하는 숫자 = " + randArray[i]);
            int curtSum = 0;
            for(int j = 0; j < 3; j++) {
                System.out.print("맞출 숫자를 입력하세요.");
                int num = input.nextInt();
                if (randArray[i] == num) {
                    System.out.println("맞았습니다. 다음 숫자를 입력하세요.");
                    sum++;
                    break;
                } else {
                    curtSum++;
                    System.out.println("틀렸습니다. 다시 입력하세요.");
                }
            }
            if(curtSum == 3) {
                break;
            }
        }
        if(sum == randArray.length) {
            System.out.println("성공!");
        } else {
            System.out.println("실패!");
        }

    }
}