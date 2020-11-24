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
 * Deskripsi Program : Memasukkan Data Bola
 */
public class Bola extends Latihan61BangunRuang{

   public Bola(float jariJari){
        super(jariJari);
    }

    @Override
    public float hitungVolume() {
        return (float) (4/3f * Math.PI * Math.pow(jariJari, 3));
    }
}
