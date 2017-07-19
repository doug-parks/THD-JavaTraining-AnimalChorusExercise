package Polymorphism.Animals;
import java.util.ArrayList;

/**
 * Created by djp4830 on 7/19/17.
 */
public class Chorus {

    // create animals arraylist for storing all of the animals
    public ArrayList<Animal> animals = new ArrayList<Animal>();  //creates an ArrayList for storing animals

    public void sing(){

        //iterate through all animals in the animals array list and print their name, type, and vocals
        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).getName() + " the " + animals.get(i).getType() + " says, \"" + animals.get(i).getSound() + "\"");
        }
    }
}