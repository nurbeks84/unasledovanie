public class Main {
    public static void main(String[] args) {
        System.out.println("Programmer: ");
        Programmer programmer = new Programmer("Apple", "Nurbek","wep developer" );
        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println("Dancer: ");

        Dancer dancer = new Dancer("kaldar","Bektur","dance");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println("singer: ");

        Singer singer = new Singer("kubik","Aigerim Rasul kyzy","singer");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();

    }
}