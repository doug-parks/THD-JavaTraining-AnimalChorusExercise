package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/12/17.
 */
public class Animal {

    String name;
    String type;
    String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal() {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

}
