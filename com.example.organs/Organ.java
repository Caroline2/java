public class Organ {

    private int health_level;
    private String name;
    private Man man;


    public Organ(int health_level, String name, Man man) {
        this.health_level = health_level;
        this.name = name;
        this.man = man;
    }

    public void doSth (Man man) {
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

    public Man getMan() {
        return this.man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
    

}
