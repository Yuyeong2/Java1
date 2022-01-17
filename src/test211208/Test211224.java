package test211208;

/*class Car {
    static int speed = 0;
    int speed2 = 0;

    void Test1 () {
        speed++;
    }

    static void speed_up() {
        // speed2++; 안됨
        speed++; //클래스 변수 speed를 1 증가
        System.out.println(speed);
    }
}*/
//------------------------------------------------------------//
class Book {
    String title;
    String author;
    void set_info(String _title, String _writer) {
        title = _title;
        author = _writer;
    }
    void print_info() {
        System.out.printf("책 제목 : %s\n책 저자 : %s\n", title, author);
    }
}
//------------------------------------------------------------//
class Song {
    String title;
    String genre;
    void set_Song(String _title, String _genre) {
        title = _title;
        genre = _genre;
    }
    void print_song() {
        System.out.printf("노래제목: %s(%s)", title, genre);
    }
}

class Singer {
    String singer;
    Song song;
    void set_Singer(String _singer) {
        singer = _singer;
    }
    void hit_Song(Song _song) {
        song = _song;
    }
    void print_singer() {
        System.out.println("가수이름: " + singer);
        song.print_song();
    }
}
//------------------------------------------------------------//
/*class Test {
    private int number;

    public void setNumber(int number){ this.number = number; }
    int getNumber(){ return number; }

    //생성자
    public Test(int number, String a) {
        System.out.println("생성자가 실행되었음.");
        this.number = number;
    }
}*/
//------------------------------------------------------------//
public class Test211224 {
    public static int sum(int i) {
        return i + 3;
    }
    public static int sum(int i, int j) {
        return i + j;
    }
    public static double sum(double a, double b) {
        return a + b / 2;
    }
    public static void main(String[] args) {
        //------------------------------------------------------------//
        System.out.println(sum(1.1, 2.5));
        //------------------------------------------------------------//
        //Test t = new Test(15, "test");
        //new Test();
        //System.out.println(t.getNumber());
//        t.setNumber(10);
//        System.out.println(t.getNumber());
        //클래스 메소드 나 클래스 변수는 클래스 이름으로 호출
/*        Car.speed++;
        Car.speed_up();*/
        //------------------------------------------------------------//
        Book book1 = new Book();
        Book book2 = new Book();

        book1.set_info("파이썬", "민경태");
        book2.set_info("어린왕자", "생텍쥐 페리");

        book1.print_info();
        book2.print_info();
        //------------------------------------------------------------//
        Song song = new Song();
        song.set_Song("취중진담", "발라드");

        Singer singer = new Singer();
        singer.set_Singer("김동률");
        singer.hit_Song(song);

        singer.print_singer();
        //------------------------------------------------------------//
    }

}
