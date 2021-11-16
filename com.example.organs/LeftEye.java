public class LeftEye extends RightEye {
    

    public LeftEye(int health_level, String name, Man man) {
        super(health_level, name, man);
    }

    @Override
    public void eyeCheck(int dio, Man man){
        System.out.println("Checking your eye...");
        try {
            Thread.sleep(500);
            } 
        catch(InterruptedException intrx){/* */}    

        if (dio == 0){
            System.out.println("Your eye left is totally ok.");
        }
        else {
            System.out.println("Seems like you need glasses with " + dio + " diopter(s).");
        }
        man.setLeftDio(dio);
    }
}
