package test211208;

class Shop {
    static int total;

    static int menu_check(String menu, int count) {
        switch (menu) {
            case "떡볶이":
                return 3000 * count;
            case "김밥":
                return 2000 * count;
            case "순대":
                return 1000 * count;
            case "튀김":
                return 500 * count;
        }
        return 0;
    }
    static void sales(String menu) {
        total += menu_check(menu, 1);
    }
    static void sales(String menu, int count) {
        total += menu_check(menu, count);
    }
    static void sales(String menu, int count, String menu2, int count2) {
        total += menu_check(menu, count);
        total += menu_check(menu2, count2);
    }

}
public class Test211227_1 {
    public static void main(String[] args) {
        Shop.sales("떡볶이");
        Shop.sales("김밥", 2);
        Shop.sales("튀김", 5);
        Shop.sales("순대", 3, "김밥", 4);
        System.out.println("총 매출: " + Shop.total + "원");
    }
}
