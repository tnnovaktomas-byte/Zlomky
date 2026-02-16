import cz.uhk.zlomky.Zlomek;

public class Main {

    static void main() {
        IO.println("Projekt ZLOMKY"); //Novinka javy 25 "IOP"

        var a = new Zlomek(); // konstruktor bez parametru = defaultni konstruktor

        a.setCitatel(1);
        a.setJmenovatel(2);
        IO.println("Zlomek : " +a.getCitatel() +"/"+a.getJmenovatel());

        Zlomek b = new Zlomek( 3, 4);

        IO.println(a);
        IO.println(b);

        var soucet = a.plus(b);

        IO.println(soucet.zkratit());


    }

}
