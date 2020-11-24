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
 * Deskripsi Program : Memasukkan Data Kerucut
 */
public class Kerucut extends Latihan61BangunRuang{

    private float tinggi;

    public Kerucut(float jariJari, float tinggi){
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public float hitungVolume() {
        return (float) (1/3f * Math.PI* Math.pow(jariJari, 2) * tinggi);
    }
}
