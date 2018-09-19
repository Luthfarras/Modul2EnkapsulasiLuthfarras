/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Faras
 */
public class UjiBus {
    public static void main(String[] args){
        Bus Buss = new Bus(20);
        
        Buss.getpenumpang(17);
        Buss.getpenumpang(24);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        //penambahan penumpang
        Buss.addpenumpang(2);
        Buss.addberatPenumpang(100);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        //penambahan penumpang
        Buss.addpenumpang(1);
        Buss.addberatPenumpang(70);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        //penambahan penumpang
        Buss.addpenumpang(2);
        Buss.addberatPenumpang(80);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        //penambahan penumpang
        Buss.addpenumpang(2);
        Buss.addberatPenumpang(60);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        //penambahan penumpang
        Buss.addpenumpang(5);
        Buss.addberatPenumpang(250);
        Buss.cetakpenumpang();
        
        System.out.println("");
        
        Buss.cetakRata();
        
    }
    
}
