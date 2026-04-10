class Ksiazka {
 String tytul;
 String autor;
 
 public Ksiazka(String tytul, String autor) {
 this.tytul = tytul;
 this.autor = autor;
 }
 void wyswietl() {
 System.out.println("Książka: " + tytul + " - " + autor);
 }
}
public class Biblioteka {
 public static void main(String[] args) {
 // 2. Stwórz nowy obiekt klasy Ksiazka o tytule "Wiedźmin" i autorze "Sapkowski"
 Ksiazka mojaKsiazka = new Ksiazka("Wiedzmin", "Sapkowski");

 mojaKsiazka.wyswietl();
 }
}
