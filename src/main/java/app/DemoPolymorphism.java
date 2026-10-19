/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Instruktur;
import model.Orang;
import model.Peserta;
/**
 *
 * @author Asus
 */
public class DemoPolymorphism {
    public static void main(String[] args) {
        Peserta peserta = new Peserta(1, "Ahmad Fauzan", "081234567801",
                "252001", "Informatika");
        Instruktur instruktur = new Instruktur(2, "Dina Pratama", "081211110001",
                "Java Desktop");
        Admin admin = new Admin(3, "Rani Putri", "081233334444",
                "Operator Akademik");


        List<Orang> daftarOrang = new ArrayList<>();
        daftarOrang.add(peserta);
        daftarOrang.add(instruktur);
        daftarOrang.add(admin);

        System.out.println("Jumlah item: " + daftarOrang.size());

        // Tahap 13: loop tanpa if tipe
        daftarOrang.forEach((o) -> {
            System.out.println(o.getInfo());
        });
        
        System.out.println("--- tampilkanInfo ---");
        tampilkanInfo(peserta);
        tampilkanInfo(instruktur);
        tampilkanInfo(admin);

        System.out.println("--- cetakSemua ---");
        cetakSemua(daftarOrang);
        
        System.out.println("--- instanceof ---");
        for (Orang o : daftarOrang) {
            if (o instanceof Peserta) {
                Peserta p = (Peserta) o;
                System.out.println("NIM khusus peserta: " + p.getNim());
            }
        }
    }
    
    public static void tampilkanInfo(Orang orang) {
        System.out.println(orang.getInfo());
    }
    
    public static void cetakSemua(List<Orang> daftar) {
        for (Orang o : daftar) {
            System.out.println(o.getInfo());
        }
    }
}
