public class Film {
    String tytul;
    String rezyser;
    int rokProdukcji;
    boolean obejrzany;

    void obejrzyj() {
        obejrzany = true;
        System.out.println("Obejrzano: \"" + tytul + "\"");
    }

    void wyswietlInfo(){
        System.out.println("Tytuł: " + tytul);
        System.out.println("Rezyser: " + rezyser);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Objerzany: " + (obejrzany ? "Tak" : "Nie"));
    }

    public static void main(String[] args) {
        Film f = new Film();
        f.tytul = " ";
        f.rezyser = " ";
        f.rokProdukcji = 0;

        f.wyswietlInfo();
        System.out.println();
        f.obejrzyj();
        f.wyswietlInfo();
    }
}