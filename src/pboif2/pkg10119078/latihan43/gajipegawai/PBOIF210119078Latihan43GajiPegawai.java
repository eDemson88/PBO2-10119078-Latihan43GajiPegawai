/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan43.gajipegawai;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GajiPegawai gaji = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU###");
        System.out.println("----------------------------------------");
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        gaji.setTotalGaji(gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTransport(), gaji.getUangTunjangan(), gaji.getGajiPokok(), gaji.getTotalGaji());
        
    }
    
}
