/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Win 10
 */
public class Karyawan {
    protected String nama;
    protected String id;
    protected String jabatan;

    // Konstruktor untuk kelas Karyawan
    public Karyawan(String nama, String id, String jabatan) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
    }

    // Metode untuk mencetak pesan absensi untuk Karyawan
    public void absensi() {
        System.out.println(nama + " telah hadir.");
    }
}
