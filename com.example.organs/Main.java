public class Main {
    
    public static void main (String[]args) {
    
        Man patient = new Man("John", false, false);
        Funcs funcs = new Funcs(patient);
        System.out.println("Welcome by the doctor, " + patient.getName());
        funcs.getWelcome();
    }
}  