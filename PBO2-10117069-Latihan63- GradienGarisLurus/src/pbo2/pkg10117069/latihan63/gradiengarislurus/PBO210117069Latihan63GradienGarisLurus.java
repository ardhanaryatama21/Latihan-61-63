/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Gradien Garis Lurus
 */
package pbo2.pkg10117069.latihan63.gradiengarislurus;

public class PBO210117069Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat ko = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+ko.getX1()+","
                +ko.getX2()+") dan "+"("+ko.getY1()+","+ko.getY2()+")");
        System.out.println("memiliki gradien sebesar : " + ko.hitungGradien());
        
        Koordinat ko2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+ko2.getX1()+","
                +ko2.getX2()+") dan "+"("+ko2.getY1()+","+ko2.getY2()+")");
        System.out.println("memiliki gradien sebesar : " + ko2.hitungGradien());
        
    }
    
}
