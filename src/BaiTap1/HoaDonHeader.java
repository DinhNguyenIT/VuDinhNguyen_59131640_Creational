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
public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH){
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    @Override
    public String toString(){
        return "Header: " + "  MaHD:" + maHD + "  Ngay ban:" + ngayBan + "  TenKH:" + tenKH + "\n";
    }
}
