import java.util.Scanner;

public class Main {
    
    public static void main (String[]args) {

        RightEye rEye = new RightEye(2, "Right Blue Eye");
        LeftEye lEye = new LeftEye(5, "Left Blue Eye");
        Mouth mouth = new Mouth(4, "Mouth");
        Stomach stomach = new Stomach(3, "Stomach");
        
        Organ[] organs = {rEye, lEye, mouth, stomach};
        System.out.println(organs[0]);
        int check = 1;

        Scanner sc = new Scanner(System.in);
        Organ myOrgan = null;

        System.out.println("Welcome by the doctor!");

        do {
        System.out.println("Which operation do you want to process?");
        for (int i = 1; i < organs.length + 1; i++) {
            System.out.println(i + ". " + organs[i - 1].getName());
        }


        int further = sc.nextInt();


            switch (further) {
            case 1:
                myOrgan = organs[0];
                break;
            
            case 2:
                myOrgan = organs[1];
                break;

            case 3:
                myOrgan = organs[2];
                break;
                
            case 4:
                myOrgan = organs[3];
                break;

            default:
                System.out.println("not defined");
                check = 0;
            }

        }while(check == 0);

        System.out.println("Opening " + myOrgan.getName());
        System.out.println("Health level: " + myOrgan.getHealth_level() + "/5");
        myOrgan.doSth();

    }
}  
