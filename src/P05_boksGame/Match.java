package P05_boksGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()){
        while (f1.health > 0 && f2.health > 0){
            System.out.println("====Yeni Round==== ");
            f2.health = f1.hit(f2);
            if (isWin()){
                break;
            }
            f1.health = f2.hit(f1);
            if (isWin()){
                break;
            }
            System.out.println(f1.name + " saglik : " + f1.health);
            System.out.println(f2.name + " saglik : " + f2.health);
        }
        }else {
            System.out.println("Sporcuların sikletleri farkli");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    boolean isWin(){

        if (f1.health ==0 ){
            System.out.println(f2.name + " kazandı");
            return true;
        }
        if (f2.health == 0){
            System.out.println(f1.name + " kazandi");
            return true;
        }
        return false;
    }
}
