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
 * Deskripsi Program : Memasukkan Semua Data
 */
public class Main {

   public static void main(String[] args) {
        Latihan61BangunRuang kerucut, tabung, bola;
        bola = new Bola(7);
        System.out.println("Volume Bola Basket");
        bola.tampil();

        kerucut = new Kerucut(14, 9);
        System.out.println("Volume Bola Kerucut");
        kerucut.tampil();

        tabung = new Tabung(10, 21);
        System.out.println("Volume Bola Tabung");
        tabung.tampil();

    }
}
