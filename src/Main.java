public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Mike","lider");
        System.out.println(person1);
        person1.learn();
        person1.walk();
        person1.eat();
        System.out.println(" ");


        Programmer programmer = new Programmer("Ann","dev","Vavilon");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(" ");

        Singer singer= new Singer("Elly","sing","blackpink");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(" ");

        Dancer dancer = new Dancer("Sam","hip-hop","aMillion");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(" ");
    }
}