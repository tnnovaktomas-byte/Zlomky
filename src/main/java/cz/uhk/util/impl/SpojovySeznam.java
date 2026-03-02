package cz.uhk.util.impl;

import cz.uhk.util.Seznam;

public class SpojovySeznam<E> implements Seznam<E> {
    private PrvekSeznamu<E> prvni, posledni;


    @Override
    public void pridej(E hodnota) {
        var novy = new PrvekSeznamu<E>(hodnota);
//        novy.hodnota = hodnota;
        if (prvni == null) {
            // seznam je prazdny a pridavame prvni hodnotu
            prvni = posledni = novy;
        } else {
            posledni.dalsi = novy;
            posledni = novy;
        }
    }

    @Override
    public void smaz(int pozice) {
        if (pozice == 0) {
            prvni = prvni.dalsi;
        } else {
            var pom = vratPrvek(pozice - 1);
            pom.dalsi = pom.dalsi.dalsi;
        }
    }

    @Override
    public E vrat(int pozice) {
        var prvek = vratPrvek(pozice);
        return (prvek != null) ? prvek.hodnota: null;
    }

    private PrvekSeznamu<E> vratPrvek(int pozice) {
        var pom = prvni;
        // for (int i = 0; i <= pozice && pom != null; i++, pom = pom.dalsi) {
        for (int i = 0; i < pozice && pom != null; i++) {
            pom = pom.dalsi;
        }
        return pom;
    }

    @Override
    public int pocet() {
        var pom = prvni;
        int pocet = 0;
        while (pom != null) {
            pom = pom.dalsi;
            pocet++;
        }
        return pocet;
    }
}

// typ prvku ve spoj. seznamu s hodnotou zatim neznameho typu
class PrvekSeznamu<E> {
    E hodnota;
    PrvekSeznamu<E> dalsi;

    public PrvekSeznamu(E hodnota) {
        this.hodnota = hodnota;
    }
}
