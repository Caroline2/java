public class Organ {

    private int health_level;
    private String name;


    public Organ(int health_level, String name) {
        this.health_level = health_level;
        this.name = name;
    }

    public void doSth () {
        System.out.println("Doing sth...");
    }

    public int getHealth_level() {
        return this.health_level;
    }

    public void setHealth_level(int health_level) {
        this.health_level = health_level;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
