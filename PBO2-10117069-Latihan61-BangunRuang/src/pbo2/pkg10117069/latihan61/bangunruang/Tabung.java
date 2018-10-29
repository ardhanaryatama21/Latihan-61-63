/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Bangun Ruang
 */
package pbo2.pkg10117069.latihan61.bangunruang;

public class Tabung extends BangunRuang{
    private double h;
    private double r;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return Math.PI*(r*r)*h;
    }
    
    
}
