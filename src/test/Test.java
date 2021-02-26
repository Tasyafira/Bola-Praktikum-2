package test;
public class Test {
    public static void main(String[] args) {
        //Membuat variabel 
        double Jarijari = 14;
        
        //Membuat objek bola untuk class Bola
        Bola bola = new Bola(7);
        //Pemanggilan method yang ada di class Bola 
        System.out.println("Jari - jari Bola        : 7.0");
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Jari - jari Bola        : "+Jarijari);
         //Pemanggilan method yang ada di class Bola 
        bola.setJarijari(Jarijari); //manipulasi variabel jari jari yang telah dibuat
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
    
}
