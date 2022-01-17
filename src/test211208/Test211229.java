package test211208;

//1------------------------------------------------------------//

/*abstract class Pokemon {
    String name;
    abstract void attack();
    abstract void sound();

    void jump() {
        System.out.println("jump!");
    }
}
class Pikachu extends Pokemon {
    @Override
    void attack() {
        System.out.println("100만 볼트!");
    }
    @Override
    void sound() {
        System.out.println("피카피카!");
    }
}*/

//------------------------------------------------------------//
interface Providable {
    void leisure();
    void sight();
    void food();
}
class KoreaTour implements Providable {
    @Override
    public void leisure() {
        System.out.println("수상스키");
    }
    @Override
    public void sight() {
        System.out.println("경복궁 관람");
    }
    @Override
    public void food() {
        System.out.println("전주 비빔밥");
    }
}
class JapanTour implements Providable {
    @Override
    public void leisure() {
        System.out.println("도쿄 번지점프");
    }
    @Override
    public void sight() {
        System.out.println("스카이트리 관람");
    }
    @Override
    public void food() {
        System.out.println("스시 먹기");
    }
}
class TourGuide {
    private Providable tour = new KoreaTour();
    private Providable tour2 = new JapanTour();
    public void leisureTour(){
        tour2.leisure();
    }
    public void sightTour(){
        tour2.sight();
    }
    public void foodTour(){
        tour2.food();
    }
}
public class Test211229 {
    public static void main(String[] args) {
        TourGuide james = new TourGuide();
        james.leisureTour();
        james.sightTour();
        james.foodTour();

        //1------------------------------------------------------------//

/*        Pikachu pika = new Pikachu();
        pika.attack();
        pika.sound();
        pika.jump();*/
        //------------------------------------------------------------//

    }
}
