package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator() {
    }

    public Excavator(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
