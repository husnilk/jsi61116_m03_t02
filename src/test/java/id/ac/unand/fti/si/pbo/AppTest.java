package id.ac.unand.fti.si.pbo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testClassPelangganAvailable()
    {
        try {
            Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");			
            pelangganClass.getField("member");
        }catch(NoSuchFieldException e) {
            assertTrue(false, "Property member tidak ditemukan");
        }catch(ClassNotFoundException e) {
            assertTrue(false, "Kelas Pelanggan tidak ditemukan");
        }    
    }
    
    @Test
    public void testClassTransaksiAvailable()
    {
        try {
            Class<?> transaksiClass = Class.forName("id.ac.unand.fti.si.pbo.Transaksi");			
            transaksiClass.getField("hargaBarang");
            transaksiClass.getField("jumlahBarang");
        }catch(NoSuchFieldException e) {
            assertTrue(false, "Property pelanggan, hargaBarang atau jumlahBarang tidak ditemukan");
        }catch(ClassNotFoundException e) {
            assertTrue(false, "Kelas Transaksi tidak ditemukan");
        }  
    }
    
    @Test
    public void testMethodHitungBayarMemberIsCorrect()
    {
        try {
            Class<?> transaksiClass = Class.forName("id.ac.unand.fti.si.pbo.Transaksi");			
            transaksiClass.getMethod("hitungTotalBayar");

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.member = true;

            Transaksi transaksi = new Transaksi(pelanggan);
            transaksi.hargaBarang = 250000;
            transaksi.jumlahBarang = 1;
            double totalBayar = transaksi.hitungTotalBayar();
            assertEquals(250000, totalBayar);

            transaksi.jumlahBarang = 3;
            totalBayar = transaksi.hitungTotalBayar();
            assertEquals(742500, totalBayar);
            
            transaksi.jumlahBarang = 10;
             totalBayar = transaksi.hitungTotalBayar();
            assertEquals(2425000, totalBayar);

            transaksi.jumlahBarang = 100;
            totalBayar = transaksi.hitungTotalBayar();
            assertEquals(23750000, totalBayar);


        }catch(NoSuchMethodException e) {
            assertTrue(false, "Method hitungTotalBayar tidak ditemukan");
        }catch(ClassNotFoundException e) {
            assertTrue(false, "Kelas Transaksi tidak ditemukan");
        }  
    }

    @Test
    public void testMethodHitungBayarNonMemberIsCorrect()
    {
        try {
            Class<?> transaksiClass = Class.forName("id.ac.unand.fti.si.pbo.Transaksi");			
            transaksiClass.getMethod("hitungTotalBayar");

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.member = false;

            Transaksi transaksi = new Transaksi(pelanggan);
            transaksi.hargaBarang = 250000;
            transaksi.jumlahBarang = 1;
            double totalBayar = transaksi.hitungTotalBayar();
            assertEquals(250000, totalBayar);

            transaksi.jumlahBarang = 3;
            totalBayar = transaksi.hitungTotalBayar();
            assertEquals(750000, totalBayar);

        }catch(NoSuchMethodException e) {
        }catch(ClassNotFoundException e) {
            assertTrue(false, "Kelas Transaksi tidak ditemukan");
        }  
    }
    
}
