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

    public class Main {
    public static void main(String[] args) {
        // Membuat instance dari Karyawan
        Karyawan karyawan = new Karyawan("Budi", "K001", "Staff");

        // Membuat instance dari Manajer
        Manajer manajer1 = new Manajer("Ani", "M001", "Manajer", "IT");

        // Memanggil metode absensi pada masing-masing instance
        karyawan.absensi();  // Output: Budi telah hadir.
        manajer1.absensi();   // Output: Ani dari departemen IT telah hadir.
    }
}

