
public class ZooTest {
    public static void main(String[] args) {
        Gorilla gorilla1 = new Gorilla();

        System.out.println(gorilla1.energyLevel);
        System.out.println(gorilla1.throwSomething());
        System.out.println(gorilla1.throwSomething());
        System.out.println(gorilla1.throwSomething());
        System.out.println(gorilla1.eatBananas());
        System.out.println(gorilla1.eatBananas());
        System.out.println(gorilla1.climb());
        System.out.println(gorilla1.displayEnergy());

        Bat bat1 = new Bat();

        System.out.println(bat1.energyLevel);
        System.out.println(bat1.attackTown());
        System.out.println(bat1.attackTown());
        System.out.println(bat1.attackTown());
        System.out.println(bat1.eatHumans());
        System.out.println(bat1.eatHumans());
        System.out.println(bat1.fly());
        System.out.println(bat1.fly());
        System.out.println(bat1.displayEnergy());
    }
}
