package telran.reflection;

public class Runner extends Sportsman {
    String speed;

    public Runner(String speed, String name) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void action() {
        System.out.printf("I am runner, my name is %s, my speed is %s",
                getName(), speed);
    }

}
