import cz.uhk.zlomky.Zlomek;

public class Main {

    static void main() {
        IO.println("Projekt ZLOMKY"); //Novinka javy 25 "IOP"

        var a = new Zlomek(); // konstruktor bez parametru = defaultni konstruktor

        a.setCitatel(3);
        a.setJmenovatel(4);
        IO.println("Zlomek : " +a.getCitatel() +"/"+a.getJmenovatel());

        Zlomek b = new Zlomek(4, 5);

        IO.println(b);

    }

}
