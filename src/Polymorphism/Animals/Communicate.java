package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/19/17.
 */
public interface Communicate {

    static void speak() {
        //iterate through all the items in the entities array list and print the name, type, and sound for each entity
        for (int i = 0; i < Chorus.entities.size(); i++) {
            System.out.println(Chorus.entities.get(i).getName() + " the " + Chorus.entities.get(i).getType() + " says, \"" + Chorus.entities.get(i).getSound() + "\"");
        }
        System.out.println("\n");
    }
}