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

public class Manajer extends Karyawan {
    private final String departemen;

    // Konstruktor untuk kelas Manajer

    public Manajer(String nama, String id, String jabatan, String departemen) {
        super(nama, id, jabatan);  // Memanggil konstruktor dari superclass (Karyawan)
        this.departemen = departemen;
    }

    // Metode yang dioverride untuk mencetak pesan absensi untuk Manajer

    /**
     *
     */
    @Override
    public void absensi() {
        System.out.println(nama + " dari departemen " + departemen + " telah hadir.");
    }
}
