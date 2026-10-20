/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Kursus {
    private String kode;
    private String nama;
    private String level;
    private double biaya;

    public Kursus(String kode, String nama, String level, double biaya) {
        setKode(kode);
        setNama(nama);
        setLevel(level);
        setBiaya(biaya);
    }

    public void setKode(String kode) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode kursus wajib diisi");
        }
        this.kode = kode.trim();
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama kursus wajib diisi");
        }
        this.nama = nama.trim();
    }

    public void setLevel(String level) {
        if (level == null || level.trim().isEmpty()) {
            throw new IllegalArgumentException("Level wajib diisi");
        }
        this.level = level.trim();
    }

    public void setBiaya(double biaya) {
        if (biaya < 0) {
            throw new IllegalArgumentException("Biaya tidak boleh negatif");
        }
        this.biaya = biaya;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getLevel() { return level; }
    public double getBiaya() { return biaya; }

    public double hitungBiayaSetelahDiskon(double persenDiskon) {
        return biaya - (biaya * persenDiskon / 100.0);
    }
}