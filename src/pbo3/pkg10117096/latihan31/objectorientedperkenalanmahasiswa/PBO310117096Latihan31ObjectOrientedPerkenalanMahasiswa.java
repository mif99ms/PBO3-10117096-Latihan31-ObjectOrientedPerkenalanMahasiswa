/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menampilkan mahasiswa
 * 
 */
public class PBO310117096Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();

    }
    
}
