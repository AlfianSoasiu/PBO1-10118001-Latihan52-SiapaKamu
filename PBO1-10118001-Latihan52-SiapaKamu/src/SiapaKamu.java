/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output siapa kamu
 */
public class SiapaKamu {

    public static void main(String[] args) {
        
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118001");
        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Alfian Soasiu");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO 1");
        mahasiswa.kelasApa();
    }
    
}
