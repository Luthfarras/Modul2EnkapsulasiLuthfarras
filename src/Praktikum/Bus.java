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
public class Bus {
    public int penumpang;
    public int maxpenumpang;
    public double average;
    public double berat;
    
    public Bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        
        if(temp > maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    
    public void getpenumpang(int password){
        if(password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    
    public void addberatPenumpang(double berat){
        double temp;
        temp = this.berat + berat;
        this .berat = temp;
        
        double r = temp/penumpang;
        this.average = r;
    }
    
    public void cetakpenumpang(){
        System.out.println("Penumpang bus sekarang: " +penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah: " +maxpenumpang);
        System.out.println("Berat Penumpang: " +berat);
    }
    
    public void cetakRata(){
        System.out.println("Rata-rata berat penumpang: " +average+ " Kg");
    }
}
