package test;
public class Bola {
    public double jariJari;
    public double luas;
    public double volume;

    //konstruktor kelas Bola    
     public Bola(double jariJari){
         this.jariJari = jariJari;
     }
    
     //Method void 
    public void setJarijari(double jariJari) {
        this.jariJari = jariJari;
    }
    //Method Non void untuk menghitung diameter bola
    public double showDiameter(){
        double diameter = 2 * jariJari;
        System.out.println("Diameter bola           : " + diameter);
        return jariJari;
    }
    //Method void untuk menghitung luas permukaan bola
    public void showLuasPermukaan(){
        this.luas =  4 * Math.PI * Math.pow(jariJari,2);
        System.out.println("Luas Permukaan Bola     : " + luas);
    }
    
    //Method non void untuk menghitunb volume bola
    public double showVolume(){
        this.volume =  4/3 * Math.PI * Math.pow(jariJari,3);
        System.out.println("Volume Bola             : " + volume);
        return volume;
    }

    
}
