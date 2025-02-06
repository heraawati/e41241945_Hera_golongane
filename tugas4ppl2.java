/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasppl2;

/**
 *
 * @author putri
 */
public class tugas4ppl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long penghasilan= 3500000000L;
       String status = "belum menikah";
       
       System.out.println("Penghasilan Tahunan = Rp. " +penghasilan);
       System.out.println("Status = " +status);
       
        if (penghasilan >= 5000000000L && status.equals("menikah")) {
           System.out.println("Pajak anda adalah 30%" );
           long pajak = 30 *penghasilan/100;
           penghasilan -= pajak;
           
       } else if (penghasilan >= 250000000L && penghasilan <= 5000000000L && status.equals("belum menikah")) {
           System.out.println("pajak anda adalah 20%");
           long pajak = 20 *penghasilan/100;
           penghasilan -= pajak;
           
      } else if (penghasilan < 2500000000L && status.equals("Tidak Diketahui")) {
           System.out.println("pajak anda adalah 10%");
           long pajak = 10 *penghasilan/100;
           penghasilan -= pajak;
           
       }else{
           System.out.println("tidak valid");
       }
          System.out.println("akhir = Rp. " +penghasilan);
       }
    }
    

