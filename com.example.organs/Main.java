import java.util.Scanner;

public class Main {
    
    public static void main (String[]args) {

        RightEye rEye = new RightEye(2, "Right Blue Eye");
        LeftEye lEye = new LeftEye(5, "Left Blue Eye");
        Mouth mouth = new Mouth(4, "Mouth");
        Stomach stomach = new Stomach(3, "Stomach");
        
        Organ[] organs = {rEye, lEye, mouth, stomach};
        System.out.println(organs[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome by the doctor");
        System.out.println("Which operation do you want to process?");
        for (int i = 1; i < organs.length + 1; i++) {
            System.out.println(i + ". " + organs[i - 1].getName());
        }

        int further = sc.nextInt();

        switch (further) {
            case 1:
                System.out.println("Opening " + organs[0].getName());
                break;
            
            case 2:
                System.out.println("Opening " + organs[1].getName());
                break;

            case 3:
                System.out.println("Opening " + organs[2].getName());
                break;
                
            case 4:
                System.out.println("Opening " + organs[3].getName());
                break;

            default:
                System.out.println("not defined");

        }

    }
}  
