import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RightEye extends Organ{

    public RightEye(int health_level, String name, Man man) {
        super(health_level, name, man);
    }

    @Override
    public void doSth(){
        System.out.println("Open the eye?");
        System.out.println("1: Yes, please check my eye.");
        System.out.println("0 (or any other number): No, close the eye and check sth else.");

        Scanner sc = new Scanner(System.in);
        int open = sc.nextInt();

        if (open == 1){
            eyeCheck(ThreadLocalRandom.current().nextInt(0, 11));
        }
        else {
            System.out.println("The eye is closed.");
        }
    }

    public void eyeCheck(int dio){
        System.out.println("Checking your eye...");
        try {
            Thread.sleep(500);
            } 
        catch(InterruptedException intrx){/* */}    

        if (dio == 0){
            System.out.println("Your eye is totally ok.");
        }
        else {
            System.out.println("Seems like you need glasses with " + dio + " diopter(s).");
        }
    }
    
}
