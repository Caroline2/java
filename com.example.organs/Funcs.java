/**
import java.util.Scanner;

public class Funcs {

    public static void whichOrgan() {}

    RightEye rEye = new RightEye(2, "Right Blue Eye");
    LeftEye lEye = new LeftEye(5, "Left Blue Eye");
    Mouth mouth = new Mouth(4, "Mouth");
    Stomach stomach = new Stomach(3, "Stomach");

    Organ[] organs = {rEye, lEye, mouth, stomach};
    Organ myOrgan = null;

    Scanner sc = new Scanner(System.in);
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

    }
}
**/