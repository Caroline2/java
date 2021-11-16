import java.lang.Thread;

public class Mouth extends Organ {

    private Boolean cleanTeeth;
    
    public Mouth(int health_level, String name, Boolean cleanTeeth, Man man) {
        super(health_level, name, man);
        this.cleanTeeth = cleanTeeth;
    }

    @Override
    public void doSth() {
        System.out.println("Checking the status of teeth...");
        try {
            Thread.sleep(500);
        } 
        catch(InterruptedException intrx){/* */}
        System.out.println("Status of teeth: " + cleanTeeth);
        if (cleanTeeth == false){
            System.out.println("Cleaning teeth...");
            try {
                Thread.sleep(500);
            } 
            catch(InterruptedException intrx){/* */}
            System.out.println("Teeth cleaned.");
            this.cleanTeeth = true;
        }
        else {
            System.out.println("Teeth are cleaned. Perfect.");
        }
    }  


    public Boolean getCleanTeeth() {
        return this.cleanTeeth;
    }

    public void setCleanTeeth(Boolean cleanTeeth) {
        this.cleanTeeth = cleanTeeth;
    }

}
