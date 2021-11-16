public class Main {
    
    public static void main (String[]args) {
    
        Man patient = new Man("John", false, false);
        Funcs funcs = new Funcs(patient);
        System.out.println("Welcome by the doctor, " + patient.getName());
        funcs.getWelcome();

        /**
         * Check the parameters
         * 
         * System.out.println(patient.getName());
         * System.out.println(patient.getLeftDio());
         * System.out.println(patient.getRightDio());
         * System.out.println(patient.isTeethStat());
         * System.out.println(patient.isDigested());
         * 
        **/
        
    }
}  