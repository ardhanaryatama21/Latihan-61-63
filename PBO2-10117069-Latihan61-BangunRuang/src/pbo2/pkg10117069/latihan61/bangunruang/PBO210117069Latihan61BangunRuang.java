/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Bangun Ruang
 */
package pbo2.pkg10117069.latihan61.bangunruang;

public class PBO210117069Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BolaBasket bb = new BolaBasket();
        bb.setR(7);
        System.out.println("Jari-jari Bola : " + bb.getR()+" cm");
        System.out.println("Volume Tabung : " + bb.hitungVolume() + " cm\n");
        
        Tabung tb = new Tabung();
        tb.setH(21);
        tb.setR(10);
        System.out.println("Tinggi Tabung : "+tb.getH()+" cm");
        System.out.println("Jari-jari Tabung : "+tb.getR()+" cm");
        System.out.println("Volume Tabung : "+tb.hitungVolume()+" cm\n");
        
        Kerucut kr = new Kerucut();
        kr.setR(14);
        kr.setT(9);
        System.out.println("Jari-jari kerucut : " + kr.getR() + " cm");
        System.out.println("Tinggi kerucut : " + kr.getT() + " cm");
        System.out.println("Volume kerucut : " + kr.hitungVolume() + " cm");
    }
}
