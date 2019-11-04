package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Gaji Pegawai
     */

public class Main {

    public static void main(String[] args) {
	    GajiPegawai gaji = new GajiPegawai();

	    gaji.setNama("Rizki Adam Kurniawan");
	    gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
	    gaji.setUangTransport(250000);
	    gaji.setUangTunjangan(300000);
	    gaji.setGajiPokok(4500000);
	    int totalGaji = gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok());

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), totalGaji);
    }
}
