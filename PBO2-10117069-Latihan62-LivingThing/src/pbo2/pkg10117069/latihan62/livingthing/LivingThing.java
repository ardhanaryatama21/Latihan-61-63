/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Living Thing
 */
package pbo2.pkg10117069.latihan62.livingthing;

public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
