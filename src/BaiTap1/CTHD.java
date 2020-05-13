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
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    int chietKhau;

    public CTHD(String sP, int sL, double donGia, int chietKhau){
        this.sanPham = sP;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.soLuong = sL;
    }

    @Override
    public String toString(){
        return "Chi tiet san pham:" + "\n" 
                + "San pham: " + sanPham + "\n" 
                + "So luong: "+ soLuong + "\n" 
                + "Don gia: " + donGia + "\n" 
                + "Chiet khau: " + chietKhau + "\n";
    }
}
