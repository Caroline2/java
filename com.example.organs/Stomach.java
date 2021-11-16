public class Stomach extends Organ{

    public Stomach(int health_level, String name, Man man) {
        super(health_level, name, man);
    }

    @Override
    public void doSth(Man man) {
    System.out.println("Processing digestion...");
    try {
        Thread.sleep(500);
        } 
    catch(InterruptedException intrx){/* */}   
    System.out.println("Digested.");
    man.setDigested(true);
    }

}
