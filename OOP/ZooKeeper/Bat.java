public class Bat extends Mammal{
    
    public Bat(){
        this.energyLevel = 300;
    }

    public String fly(){
        this.energyLevel -= 50;
        return "The bat has taken flight";
    }

    public String eatHumans(){
        this.energyLevel += 25;
        return "The bat has eaten a human and is satisfied";
    }

    public String attackTown(){
        this.energyLevel -= 100;
        return "The bat has attacked a town";
    }
}
