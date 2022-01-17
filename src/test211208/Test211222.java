package test211208;

import java.util.*;

class CoffeeMachine {
    //잔돈 계산기
    int changeCalculator(String coffee, int money) {
        int menu = 0;
        switch (coffee) {
            case "아메리카노":
                menu = 1000;
                break;
            case "카페라떼":
                menu = 1500;
                break;
            case "카푸치노":
                menu = 2000;
                break;
            default:
                System.out.println("Error : 없는 커피를 주문하였음");
                return money;
        }
        if(money < menu) {
            System.out.println("Error: 금액이 부족합니다.");
            return money;
        }
        return money - menu;
    }
}

public class Test211222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("커피 종류를 입력하세요 >>> ");
        String coffee = input.nextLine();

        System.out.print("돈을 넣어주세요 >>> ");
        int money = input.nextInt();

        CoffeeMachine cm = new CoffeeMachine();

        int result_change = cm.changeCalculator(coffee, money);
        System.out.println("받은 잔돈 : " + result_change);

        //------------------------------------------------------------//
/*
        House h1 = new House();
        System.out.println(h1.welcome(2, 2));
        */
        //------------------------------------------------------------//
        /*ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<String> test = new ArrayList<String>();

        String test2 = "1";
        int test3 = 1;

        int result2 = Integer.valueOf(test2);
        System.out.println(result2);

        String result = String.valueOf(test3);
        System.out.println(result);*/

        /*
        test.add("test1");
        test.add("test2");

        test.remove("test2");

        for (String string: test) {
            System.out.println(string);
        }
        */
        //------------------------------------------------------------//
        /*
        String[] s = {"one4seveneight", "23fourfive6", "eight123four",
        "57124", "fivesixone"};

        for(int i = 0; i < s.length; i++) {
            String nowS = s[i];

            nowS = nowS.replace("zero", "0");
            nowS = nowS.replace("one", "1");
            nowS = nowS.replace("two", "2");
            nowS = nowS.replace("three", "3");
            nowS = nowS.replace("four", "4");
            nowS = nowS.replace("five", "5");
            nowS = nowS.replace("six", "6");
            nowS = nowS.replace("seven", "7");
            nowS = nowS.replace("eight", "8");
            nowS = nowS.replace("nine", "9");

            System.out.println("정답 : " + (Integer.valueOf(nowS) + 1));
        }
            String s1 = "eight123four";

            s1 = s1.replace("eight", "8");
            s1 = s1.replace("four", "4");

            System.out.println(s1);
            */
        //------------------------------------------------------------//
    }
}
