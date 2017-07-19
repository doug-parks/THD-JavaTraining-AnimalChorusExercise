package Polymorphism.Animals;

/**
 * Created by djp4830 on 7/19/17.
 */
public abstract class Entity implements Communicate{

    private String name;
    private String type;
    private String sound;

    String getName() {
        return name;
    }

    String getType() {
        return type;
    }

    String getSound() {
        return sound;
    }

    public Entity(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
}