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
public class LatihanTerarah {
    public static void main(String[] args) {           //main method
        //variabel
        String kode = "JAVA-BSC";
        String nama = "Java Desktop Fundamental";
        boolean aktif = true;

        double biaya = 3_825_000;
        double registrasi = 500_000;

        // Total sebelum diskon
        double totalSebelumDiskon = biaya + registrasi;

        // Menentukan diskon
        double diskon;

        if (totalSebelumDiskon >= 3_500_000) {
        diskon = 0.15; // 15%
    } else if (totalSebelumDiskon >= 1_500_000) {
        diskon = 0.10; // 10%
    } else if (totalSebelumDiskon >= 1_000_000) {
        diskon = 0.05; // 5%
    } else {
        diskon = 0.0;  // Tidak ada diskon
    }

        // Menghitung potongan dan total
        double potongan = totalSebelumDiskon * diskon;
        double total = totalSebelumDiskon - potongan;

        // Menentukan status
        String status;

        if (total >= 3_500_000) {
            status = "MAHAL";
        } else {
            status = "TERJANGKAU";
        }

        // Menampilkan hasil
        System.out.println("Kode       : " + kode);
        System.out.println("Kursus     : " + nama);
        System.out.println("Aktif      : " + aktif);
        System.out.printf("Biaya      : Rp%,.0f%n", biaya);
        System.out.printf("Registrasi : Rp%,.0f%n", registrasi);
        System.out.printf("Sebelum Diskon : Rp%,.0f%n", totalSebelumDiskon);
        System.out.printf("Diskon     : %.0f%%%n", diskon * 100);
        System.out.printf("Potongan   : Rp%,.0f%n", potongan);
        System.out.printf("Total      : Rp%,.0f%n", total);
        System.out.println("Status     : " + status);
    }
}
