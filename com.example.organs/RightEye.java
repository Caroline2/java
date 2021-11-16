import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RightEye extends Organ{

    Scanner sc = new Scanner(System.in);

    public RightEye(int health_level, String name, Man man) {
        super(health_level, name, man);
    }

    @Override
    public void doSth(Man man){
        System.out.println("Open the eye?");
        System.out.println("1: Yes, please check my eye.");
        System.out.println("0 (or any other number): No, close the eye and check sth else.");

        int open = sc.nextInt();

        if (open == 1){
            eyeCheck(ThreadLocalRandom.current().nextInt(0, 11), man);
        }
        else {
            System.out.println("The eye is closed.");
        }
    }

    public void eyeCheck(int dio, Man man){
        System.out.println("Checking your eye...");
        try {
            Thread.sleep(500);
            } 
        catch(InterruptedException intrx){/* */}    

        if (dio == 0){
            System.out.println("Your right eye is totally ok.");
        }
        else {
            System.out.println("Seems like you need glasses with " + dio + " diopter(s).");
        }
        man.setRightDio(dio);
    }
    
}
