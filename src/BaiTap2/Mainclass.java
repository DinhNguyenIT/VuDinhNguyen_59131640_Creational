/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author NGUYENPC
 */
public class Mainclass {
        public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Nguyen ")
        .addFloat(23f).addbool(true);
        System.out.println(builder.toString());

    }
}
