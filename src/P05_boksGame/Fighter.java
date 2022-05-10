package P05_boksGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge=0;
        }

    }

    int hit(Fighter foe){
        System.out.println(name + " => " + foe.name + " " + damage + " hasar vuruldu");

        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasari blokladi");
            return foe.health;
        }
        if (foe.health - damage < 0){
            return 0;
        }

        return foe.health - damage;
    }

    boolean isDodge(){

        double randomNumber = Math.random() * 100;

        return randomNumber <= dodge;
    }

}
