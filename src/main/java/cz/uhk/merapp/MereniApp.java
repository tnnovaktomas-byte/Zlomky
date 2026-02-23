package cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {

    static void main() {
        var mereni = new Mereni();
        mereni.pridat(new Zlomek(12,7));
        mereni.pridat(new Zlomek(8,9));
        mereni.pridat(new Zlomek(4,11));
        mereni.pridat(new Zlomek(31,7));
        mereni.pridat(new Zlomek(14,10));
        mereni.pridat(10);
        mereni.pridat(12.8);
        mereni.pridat(15E3);
        mereni.pridat(10235);
        mereni.pridat(-15.4);

        IO.println("Soucet je %f".formatted(mereni.secist().doubleValue()));
        IO.println("Prumer je %f".formatted(mereni.prumer().doubleValue()));
        IO.println("Maximum je %f".formatted(mereni.max().doubleValue()));
        IO.println("Minimum je %f".formatted(mereni.min().doubleValue()));

        for (int i = 0; i < mereni.size(); i++) {
            Number m = mereni.get(i);
            if (m instanceof Zlomek)
                IO.println(m);
            else if (m instanceof Double)
                IO.println("%g".formatted(m));
            else
                IO.println(m);
        }

    }
}
