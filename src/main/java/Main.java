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
        var rozdil = a.minus(b);
        var soucin = a.krat(b);
        var podil = a.deleno(b);

        //System.out.printf("Soucet je %s", soucet.zkratit());
        IO.println("Součet je: %s".formatted(soucet.zkratit()));
        IO.println("Rozdíl je: %s".formatted(rozdil.zkratit()));
        IO.println("Součin je:  %s".formatted(soucin.zkratit()));
        IO.println("Podíl je %s".formatted(podil.zkratit()));

        Zlomek [] pole = new Zlomek[] {
            new Zlomek (1,3),
            new Zlomek(1,2),
            new Zlomek(6,5),
            new Zlomek(4,3),
            new Zlomek (7,8),
            new Zlomek (13,10)
        };
        Zlomek prumer = prumer(pole);
        IO.println("Průměr je %s".formatted(prumer.zkratit()));

        int celeCislo = new Zlomek(25,12).intValue();
        IO.println("Zlomek na celé číslo:  %d".formatted(celeCislo));

    }

    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek(); //nulovy zlomek
        for (var z : pole) {
            soucet = soucet.plus(z);
        }
        var pocet = new Zlomek(pole.length, 1);
        return soucet.deleno(pocet);
    }

}
