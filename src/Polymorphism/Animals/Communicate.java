package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/19/17.
 */
public interface Communicate {

    static void speak() {
        for (int i = 0; i < Chorus.entities.size(); i++) {
            System.out.println(Chorus.entities.get(i).getName() + " the " + Chorus.entities.get(i).getType() + " says, \"" + Chorus.entities.get(i).getSound() + "\"");
        }
        System.out.println("\n");
    }
}