/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author NGUYENPC
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon HD = new HoaDon.Builder().setHeader( new HoaDonHeader("1234", "22/07/1999", "Vu Dinh Nguyen"))
        .addDSHD( new CTHD("Nuoc khoang", 20, 10000, 2))
        .build();
        System.out.println(HD.toString());
    }
    
}
