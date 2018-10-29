/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Bangun Ruang
 */
package pbo2.pkg10117069.latihan61.bangunruang;

public class BolaBasket extends BangunRuang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return 4*r*r*r*Math.PI/3;
    }
    
    
}
