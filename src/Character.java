/**
 * Created with IntelliJ IDEA.
 * User: Guillaume
 * Date: 04/02/13
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class Character {

    private String name;
    private long hp;
    private long strenght;
    private long agility;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getStrenght() {
        return strenght;
    }

    public void setStrenght(long strenght) {
        this.strenght = strenght;
    }

    public long getAgility() {
        return agility;
    }

    public void setAgility(long agility) {
        this.agility = agility;
    }

    public Character(){
        System.out.println("creation du personne sans parametre");
        name="Inconnu";
        hp = 0;
        strenght = 0;
        agility = 0;
    }

    public Character(String name, long hp, long strenght, long agility){
        System.out.println("creation du personnage avec parametre");
        this.name=name ;
        this.hp= hp;
        this.strenght= strenght;
        this.agility = agility;
    }

    public Character createWarrior(){
         return new Character("Warrior", 10, 10, 10);
     }

    public Character createAssassin(){
        return new Character("Assassin", 10, 10, 10);
    }

    public Character createBerserk(){
        return new Character("Berserk", 10, 10, 10);
    }
}


