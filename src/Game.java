/**
 * Created with IntelliJ IDEA.
 * User: Guillaume
 * Date: 04/02/13
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    public void start(){
        Character character = new Character();
        Character character1 = new Character("Guillaume", 100,100,100);
        System.out.println(character1.getName());
        character1.setName("valentin");
        System.out.println(character1.getName());


    }
}
