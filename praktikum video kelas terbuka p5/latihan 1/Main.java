class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}
class Player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}


public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("otong",50);

        Weapon pedang = new Weapon("pedang",15);
        Weapon ketapel = new Weapon("ketapel",1);

        Armor bajuBesi = new Armor("baju besi",10);
        Armor kaos = new Armor("kaos",0);
        
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}