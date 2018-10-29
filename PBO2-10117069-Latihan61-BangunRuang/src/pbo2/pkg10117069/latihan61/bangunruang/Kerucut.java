/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Bangun Ruang
 */
package pbo2.pkg10117069.latihan61.bangunruang;

public class Kerucut extends BangunRuang{
    private double t;
    private double r;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI*(r*r))*1/3*t;
    }
}
