/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class LatihanBidangDatar {
    public static void main(String[] args){
        // ===== Persegi Panjang =====
        String namaBidang = "Persegi Panjang";
        double panjang = 15.0;
        double lebar = 8.0;

        // Rumus Luas dan Keliling
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan Hasil
        System.out.println("=== Perhitungan Bidang Datar ===");
        System.out.println("Bidang Datar : " + namaBidang);
        System.out.println("Panjang      : " + panjang + " cm");
        System.out.println("Lebar        : " + lebar + " cm");
        System.out.println("Luas         : " + luas + " cm persegi");
        System.out.println("Keliling     : " + keliling + " cm");

        // ===== Lingkaran =====
        String namaLingkaran = "Lingkaran";
        double jariJari = 7.0;

        // Rumus Luas dan Keliling Lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan Hasil
        System.out.println();
        System.out.println("Bidang Datar : " + namaLingkaran);
        System.out.println("Jari-jari    : " + jariJari + " cm");
        System.out.println("Luas         : " + String.format("%.2f", luasLingkaran) + " cm persegi");
        System.out.println("Keliling     : " + String.format("%.2f", kelilingLingkaran) + " cm");
    }
}
