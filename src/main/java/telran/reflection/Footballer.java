package telran.reflection;

public class Footballer extends Sportsman {
    private String team;

    public Footballer(String team, String name) {
        super(name);
        this.team = team;
    }

    @Override
    public void action() {
        System.out.printf("I'm football player, my name is %s, I play in %s team",
                getName(), team);
    }

}
