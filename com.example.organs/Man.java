public class Man {

    private String name;
    private int leftDio;
    private int rightDio;
    private Boolean teethStat;
    private Boolean digested;

    public Man(String name, int leftDio, int rightDio, Boolean teethStat, Boolean digested) {
        this.name = name;
        this.leftDio = leftDio;
        this. rightDio = rightDio;
        this.teethStat = teethStat;
        this.digested = digested;
    }

    public Man(String name, Boolean teethStat, Boolean digested) {
        this.name = name;
        this.teethStat = teethStat;
        this.digested = digested;
    }
    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the leftDio
     */
    public int getLeftDio() {
        return leftDio;
    }

    /**
     * @param leftDio the leftDio to set
     */
    public void setLeftDio(int leftDio) {
        this.leftDio = leftDio;
    }

    /**
     * @return int return the rightDio
     */
    public int getRightDio() {
        return rightDio;
    }

    /**
     * @param rightDio the rightDio to set
     */
    public void setRightDio(int rightDio) {
        this.rightDio = rightDio;
    }

    /**
     * @return Boolean return the teethStat
     */
    public Boolean isTeethStat() {
        return teethStat;
    }

    /**
     * @param teethStat the teethStat to set
     */
    public void setTeethStat(Boolean teethStat) {
        this.teethStat = teethStat;
    }

    /**
     * @return Boolean return the digested
     */
    public Boolean isDigested() {
        return digested;
    }

    /**
     * @param digested the digested to set
     */
    public void setDigested(Boolean digested) {
        this.digested = digested;
    }

}
