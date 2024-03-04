public class Main{
    public static void main(String[] args) {
        String[] isimler = {"kadir", "gökhan", "hakan", "suzan", "pınar", "mehmet", "ali", "emel", "fırat", "james", "jale", "ersin", "deniz", "gözde", "anıl", "burak"};
        int[] dakikalar = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        KosucuListesi kosucuListesi = new KosucuListesi(isimler, dakikalar);
        int enDusukZamanaSahipKisiIndeksi = kosucuListesi.enDusukZamanaSahipKisiyiBul();
        System.out.println("En düşük zamana sahip kişi: " + isimler[enDusukZamanaSahipKisiIndeksi] + ", zamanı: " + dakikalar[enDusukZamanaSahipKisiIndeksi]);

        int ikinciEnIyiZaman = kosucuListesi.ikinciEnIyiZamaniBul();
        System.out.println("İkinci en iyi zaman: " + ikinciEnIyiZaman);

        int enDusukZamanaSahipUcuncuKisiIndeksi = kosucuListesi.enDusukZamanaSahipUcuncuKisiyiBul();
        if (enDusukZamanaSahipUcuncuKisiIndeksi != -1) {
            System.out.println("Üçüncü en düşük zamana sahip kişi: " + isimler[enDusukZamanaSahipUcuncuKisiIndeksi] + ", zamanı: " + dakikalar[enDusukZamanaSahipUcuncuKisiIndeksi]);
        } else {
            System.out.println("En az 3 kişi yok");

        }
        kosucuListesi.siniflandirmaYap();

    }
}