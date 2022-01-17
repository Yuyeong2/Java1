package test211208.classTest;

import java.util.ArrayList;
import java.util.Scanner;

//책의 정보를 저장하는 클래스
class Books {
    private String bookName; //책 제목
    private int bookCount; //책의 개수

    public String getBookName() {
        return bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount += bookCount;
    }

    //Books 클래스의 생성자 (책을 살때(새로 만들 때) 부터 책 제목과 개수를 설정하도록)
    public Books(String bookName, int bookCount) {
        this.bookName = bookName;
        this.bookCount = bookCount;
    }
}

//사용자 클래스
class Users {
    private String userName;

    private static Scanner input = new Scanner(System.in);
    ArrayList<String> bookNames = new ArrayList<>();
    ArrayList<Integer> bookCounts = new ArrayList<>();
    ArrayList<Books> books = null;

    //생성자 (사용자를 생성할 때 이름을 설정할 수 있도록)
    public Users(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    Books Find_book(String bookName) {//기존에 존재하는 책이 있는지 검사하는 기능
        for (Books book : books) {
            if (book.getBookName().equals(bookName)) {//기존에 책이 존재한다면
                return book; //책을 찾았다면 해당 책의 객체를 반환
            }
        }
        return null; //책이 없다면 null을 반환
    }

    void Bring_book() { //책 대여기능
        System.out.println("대여할 책의 제목을 입력하세요 >> ");
        String bookName = input.next();

        Books nowBook = Find_book(bookName);

        if(nowBook != null) { //기존에 해당 제목의 책이 존재할 경우
            int all_bookCount = nowBook.getBookCount();
            System.out.println("현재" + nowBook.getBookName() + "의 재고는 " + all_bookCount + "입니다.");
            System.out.println("대여할 책의 수량을 입력하세요 >> ");
            int bookCount = input.nextInt();
            //만약 대여 수량이 넉넉하다면
            if(all_bookCount >= bookCount) {
                bookNames.add(bookName);//대여 한다
                bookCounts.add(bookCount);//대여 한다
                nowBook.setBookCount(-bookCount);//현재 존재하는 책의 총 수량을 감소시킨다.
            }
            else {
                System.out.println("수량이 넉넉하지 않습니다!");
            }
        }
        else { //기존에 해당 제목의 책이 존재하지 않을 경우
            System.out.println("해당 제목의 책은 존재하지 않습니다. 대여 불가!");
        }
    }

    void Return_book() { //책 반납기능

    }

    void Open_inform() { //대여중인 책 정보 열람
        System.out.println("현재 대여중인 책의 정보 >> ");
        for (int i = 0; i < bookNames.size(); i++) {
            System.out.println("책 이름: " + bookNames.get(i) + ", 수량: " + bookCounts.get(i));
            System.out.println(); //줄바꿈
        }
    }

    void Select_menu(ArrayList<Books> books) {
        this.books = books;

        while(true) {
            System.out.println("******* 메뉴를 선택하세요 *******");
            System.out.println("1.책대여 /2.책반납 /3.현재 대여중인 책 정보 열람 /4.종료");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("책 대여 메뉴입니다");
                    Bring_book();
                    break;
                case 2:
                    System.out.println("책 반납 메뉴입니다");
                    Return_book();
                    break;
                case 3:
                    System.out.println("대여 정보 열람 메뉴입니다");
                    Open_inform();
                    break;
                case 4:
                    System.out.println("==== 종료 ====");
                    return;
                default:
                    System.out.println("그런 메뉴 없어요^^;");
                    break;
            }
        }
    }

}

//관리자 클래스
class Manager {
    private static Scanner input = new Scanner(System.in);
    //모든 책을 관리하는 ArrayList
    private ArrayList<Books> books = new ArrayList<>();
    //모든 사용자를 관리하는 ArrayList
    private ArrayList<Users> users = new ArrayList<>();

    public ArrayList<Books> getBooks() {
        return books;
    }

    public Users getUser() {
        System.out.println("로그인할 사용자 이름을 입력하세요 >> ");
        String userName = input.next();

        for (Users user : users) {
            if(user.getUserName().equals(userName)) {
                return user;
            }
        }

        return null;
    }

    Books Find_book(String bookName) {//기존에 존재하는 책이 있는지 검사하는 기능
        for (Books book : books) {
            if (book.getBookName().equals(bookName)) {//기존에 책이 존재한다면
                return book; //책을 찾았다면 해당 책의 객체를 반환
            }
        }
        return null; //책이 없다면 null을 반환
    }

    void Add_user() { //사용자 추가 기능
        String userName = input.next(); //사용자 이름 입력받음

        for (int i = 0; i < users.size(); i++) {
            //내가 입력한 이름과 기존에 저장된 이름이 같다면 이미 존재하는 사용자
            if(users.get(i).getUserName().equals(userName)) {
                System.out.println("이미 사용자가 존재합니다!");
                return; //메소드 종료시킴
            }
        }
        //내가 입력한 이름으로 새로운 Users객체를 만들어서 users ArrayList에 추가한다
        Users newUser = new Users(userName);
        users.add(newUser);
    }

    //책을 사는 기능(추가 기능)
    void Buy_book() {
        System.out.println("구입할 책의 제목을 입력하세요 >> ");
        String bookName = input.next();

        Books nowBook = Find_book(bookName);

        System.out.println("구입할 책의 수량을 입력하세요 >> ");
        int bookCount = input.nextInt();

        if(nowBook != null) { //기존에 해당 제목의 책이 존재할 경우
            System.out.println(bookName + "수량을" + bookCount +"만큼 증가시킵니다.");
            nowBook.setBookCount(bookCount); //기존의 책의 수량을 더한다
        }
        else { //기존에 해당 제목의 책이 존재하지 않을 경우
            System.out.println(bookName + "을" + bookCount +"만큼 구입합니다.");
            nowBook = new Books(bookName, bookCount); //새로운 책을 구입해서 가져온다
            books.add(nowBook); //새로 구입한 책의 객체를 ArrayList에 추가한다
        }
    }

    //책을 파는 기능(삭제 기능)
    void Sell_book() {
        System.out.println("판매할 책의 제목을 입력하세요 >> ");
        String bookName = input.next();

        Books nowBook = Find_book(bookName);

        if(nowBook == null) { //책이 존재하지 않을 경우
            System.out.println("그런 책은 존재하지 않습니다.");
            return; //메소드 종료
        }

        System.out.println("판매할 책의 수량을 입력하세요 >> ");
        int bookCount = input.nextInt();

        if(nowBook.getBookCount() >= bookCount) { //재고가 있어서 판매가 가능하다면
            nowBook.setBookCount(-bookCount);
        }
        else { //재고가 충분하지 않다면
            System.out.println("재고가 부족하여 판매가 불가능합니다.");
        }
    }

    //메뉴 선택 기능
    void Select_menu() {
        while(true) {
            System.out.println("******* 메뉴를 선택하세요 *******");
            System.out.println("1.책구입 / 2.책판매 /3.정보열람 /4.사용자추가 /5.종료");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("책 구입 메뉴입니다");
                    Buy_book();
                    break;
                case 2:
                    System.out.println("책 판매 메뉴입니다");
                    Sell_book();
                    break;
                case 3:
                    System.out.println("정보 열람 메뉴입니다");
                    Open_inform();
                    break;
                case 4:
                    System.out.println("사용자 추가 메뉴입니다");
                    Add_user();
                    break;
                case 5:
                    System.out.println("==== 종료 ====");
                    return;
                default:
                    System.out.println("그런 메뉴 없어요^^;");
                    break;
            }
        }
    }

    void Open_inform() { //현재 구입된 모든 책의 정보를 출력하는 기능
        System.out.println("현재 저장되어있는 책의 정보 >>> ");

        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            String bookName = book.getBookName(); //해당 book객체에 저장되어있는 이름
            int bookCount = book.getBookCount(); //해당 book객체에 저장되어있는 수량
            System.out.println("책제목: " + bookName
                    + ", 책수량:" + bookCount);
        }
    }
}


//Main Program
public class LibProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager james = new Manager();

        while(true) {
            System.out.println("******* 메뉴를 선택하세요 *******");
            System.out.println("1.관리자메뉴 / 2.사용자메뉴 / 3.종료");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("관리자 메뉴입니다");
                    james.Select_menu();
                    break;
                case 2:
                    System.out.println("사용자 메뉴입니다");
                    Users user = james.getUser();
                    if(user == null) {
                        System.out.println("그런 사용자는 없습니다.");
                        break;
                    }
                    System.out.println(user.getUserName() + "의 사용자 메뉴입니다.");
                    user.Select_menu(james.getBooks());
                    break;
                case 3:
                    System.out.println("==== 종료 ====");
                    return;
                default:
                    System.out.println("그런 메뉴 없어요^^;");
                    break;
            }
        }

    }

}