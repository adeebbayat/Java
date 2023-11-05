public class Gorilla extends Mammal{

    public Gorilla(){
        
    }

    public String throwSomething(){
        this.energyLevel -= 5;
        return "Gorilla has thrown something";
    }

    public String eatBananas(){
        this.energyLevel += 10;
        return "The Gorilla has eaten and is satisfied";
    }

    public String climb(){
        this.energyLevel -= 10;
        return "The Gorilla has climbed";
    }
}