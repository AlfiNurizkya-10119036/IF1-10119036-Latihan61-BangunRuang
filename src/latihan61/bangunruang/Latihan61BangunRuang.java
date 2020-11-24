/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan61.bangunruang;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program : Manghasilkan Output Bangun Ruang
 * 
 */
public abstract class Latihan61BangunRuang {

   protected float jariJari;

    public Latihan61BangunRuang(float jariJari){
        this.jariJari = jariJari;
    }

    public abstract float hitungVolume();

    public void tampil(){
        System.out.printf("Volume : %.0f cm%n", Math.ceil(hitungVolume()));
    }
}
