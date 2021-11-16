import java.lang.Thread;

public class Mouth extends Organ {
    
    public Mouth(int health_level, String name, Man man) {
        super(health_level, name, man);
    }

    @Override
    public void doSth(Man man) {
        System.out.println("Checking the status of teeth...");
        try {
            Thread.sleep(500);
        } 
        catch(InterruptedException intrx){/* */}
        System.out.println("Status of teeth: " + man.isTeethStat());
        if (man.isTeethStat() == false){
            System.out.println("Cleaning teeth...");
            try {
                Thread.sleep(500);
            } 
            catch(InterruptedException intrx){/* */}
            System.out.println("Teeth cleaned.");
            man.setTeethStat(true);
        }
        else {
            System.out.println("Teeth are cleaned. Perfect.");
        }
    }  
}
