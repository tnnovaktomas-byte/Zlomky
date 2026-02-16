package cz.uhk.zlomky;

public class Zlomek {
    public Object zkratit;
    private int citatel;
    private int jmenovatel;

    public Zlomek () {
        citatel = 0;
        jmenovatel = 1;
    }

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
                "%d/%d",
                citatel,jmenovatel);
    }

    /**
     * Metoda pro sčítání 2 zlomků
     * @param druhy
     * @return nový zlome, který je souctem obou zlomku
     */


    public Zlomek plus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek minus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel - druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek krat(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel * druhy.citatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(Zlomek druhy) {
        int jm = jmenovatel * druhy.citatel;
        int cit = citatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }


    public Zlomek zkratit () {
        int delitel = nsd(citatel, jmenovatel); //vypocet nejv. spol. delitele

        return new Zlomek(citatel/delitel, jmenovatel/delitel);
    }

    /**
     * Vypocet největšího společného delitele cisel a a b
     * @param a
     * @param b
     * @return
     */
    private int nsd(int a, int b) {
        if(a<b) {
            var temp = a;
            a=b;
            b=temp;
        }
        int zbytek;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        } while (zbytek != 0);
        return a;
    }

    //pretizene plus pro pricteni celeho cisla ke zlomku
    public Zlomek plusCislo(int cislo) {
        int cit = citatel + jmenovatel * cislo;

        return new Zlomek(cit, cit);
    }

}
