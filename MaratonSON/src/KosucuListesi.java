import java.util.Arrays;

public class KosucuListesi {
    private String[] isimler;
    private int[] dakikalar;

    public KosucuListesi(String[] isimler, int[] dakikalar) {
        this.isimler = isimler;
        this.dakikalar = dakikalar;
    }
    public int enDusukZamanaSahipKisiyiBul() {
        int enDusukDakika = Integer.MAX_VALUE;
        int indeks = -1;
        for (int i = 0; i < dakikalar.length; i++) {
            if (dakikalar[i] < enDusukDakika) {
                enDusukDakika = dakikalar[i];
                indeks = i;
            }
        }
        return indeks;
    }

    public int ikinciEnIyiZamaniBul() {
        int enDusukZamanaSahipKisiIndeksi = enDusukZamanaSahipKisiyiBul();
        int ikinciEnIyiZaman = Integer.MAX_VALUE;
        for (int i = 0; i < dakikalar.length; i++) {
            if (i != enDusukZamanaSahipKisiIndeksi && dakikalar[i] < ikinciEnIyiZaman) {
                ikinciEnIyiZaman = dakikalar[i];
            }
        }
        return ikinciEnIyiZaman;
    }

    public int enDusukZamanaSahipUcuncuKisiyiBul() {
        int[] siraliDakikalar = Arrays.copyOf(dakikalar, dakikalar.length);
        Arrays.sort(siraliDakikalar);
        return Math.min(3, siraliDakikalar.length) == 3 ? 2 : -1;
    }

    public void siniflandirmaYap() {
        int sinifA = 0;
        int sinifB = 0;
        int sinifC = 0;
        for (int dakika : dakikalar) {
            if (dakika >= 200 && dakika <= 299) {
                sinifA++;
            } else if (dakika >= 300 && dakika <= 399) {
                sinifB++;
            } else {
                sinifC++;
            }
        }
        System.out.println("A → " + sinifA + ", B → " + sinifB + ", C → " + sinifC);
    }
}