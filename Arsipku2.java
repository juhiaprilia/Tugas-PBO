
package arsipku2;

public class Arsipku2 implements Biodata2, Nilai2 {
    
    
    public static void main(String[] args) {
        Arsipku2 ps = new Arsipku2();
        ps.Biodata();
        ps.nama();
        ps.tempatLahir();
        ps.hobi();
        ps.Nilai();
        ps.agama();
        ps.BahasaIndonesia();
        ps.matematika();
    }
    public void Biodata (){
        System.out.println("Biodata");
    }
    public void nama (){
        System.out.println("Nama         : Riska Juhi Aprilia");
    }
    public void tempatLahir (){
        System.out.println("Tempat Lahir : Jember");
    }
    public void hobi (){
        System.out.println("Hobi         : Makan");
    }
    public void Nilai (){
        System.out.println("Nilai");
    }
    public void agama (){
        System.out.println("Agama            : 80");
    }
    public void BahasaIndonesia (){
        System.out.println("Bahasa Indonesia : 75");
    }
    public void matematika () {
        System.out.println("Matematika       : 86");
    }
}
