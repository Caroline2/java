import java.util.Scanner;

public class Funcs {

    RightEye rEye = new RightEye(2, "Right Blue Eye");
    LeftEye lEye = new LeftEye(5, "Left Blue Eye");
    Mouth mouth = new Mouth(4, "Mouth", false);
    Stomach stomach = new Stomach(3, "Stomach");
    
    Organ[] organs = {rEye, lEye, mouth, stomach};
    Organ myOrgan = null;

    Scanner sc = new Scanner(System.in);


    public void getWelcome() {

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
        }
        if (myOrgan != null){

            System.out.println("Opening " + myOrgan.getName());
            System.out.println("Health level: " + myOrgan.getHealth_level() + "/5");
            organFunc(myOrgan);
        }
        else{
            getWelcome();
        }

    }  

    public void organFunc(Organ myOrgan) {

        myOrgan.doSth();
        System.out.println("The operation was formed. Wanna check the other organs too?");
        System.out.println("1. Yes, please!");
        System.out.println("2. (or any other number) No, terminate the app.");
        
        int cont = sc.nextInt();

        if (cont == 1){
            getWelcome();
        }
        else {
            System.out.println("Thanks for coming for the medical examination. See ya next time!");
        }
    }
}   