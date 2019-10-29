package com.example.recyclerview;

import android.graphics.drawable.Drawable;

public class Keluarga {
    private String nama, namap;
    private Drawable gambar;

    public Keluarga(String nama, String namap, Drawable gambar) {
        this.nama = nama;
        this.namap = namap;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNamap() {
        return namap;
    }

    public void setNamap(String namap) {
        this.namap = namap;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;


    }
}