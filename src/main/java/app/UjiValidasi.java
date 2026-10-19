/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Instruktur;
import model.Peserta;

/**
 *
 * @author Asus
 */
public class UjiValidasi {
    public static void main(String[] args) {
        try {
            Peserta p = new Peserta(1, "", "081234567890", "252001", "Informatika");
            System.out.println(p.getNama());
        } catch (IllegalArgumentException ex) {
            System.out.println("DITOLAK: " + ex.getMessage());
        }

        Peserta peserta = new Peserta(
            1, "Ahmad Fauzan", "081234567801",
            "252001", "Informatika");
        Instruktur instruktur = new Instruktur(
            2, "Dina Pratama", "081211110001",
            "Java Desktop");
        System.out.println(peserta.getInfo());
        System.out.println(instruktur.getInfo());
    }
}
