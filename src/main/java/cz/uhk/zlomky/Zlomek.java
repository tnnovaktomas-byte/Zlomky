package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {}

    /**
     * konstrukto se 2 parametry
     * @param citatel
     * @param jmenovatel
     */

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;

    }

    //selektory = getry = metoda pro čtení dat
    public int getCitatel() {
        return citatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }

    //modifikátory = setry = metody pro změnu/zápis dat
    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }
    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }


    @Override   //@ = anotace... override = předefinování
    public String toString() {
        return String.format(       //Formátování na střed
                "%3d\n-----\n%3d",
                citatel,jmenovatel);
    }
}
