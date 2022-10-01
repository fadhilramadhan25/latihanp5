/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package latihan_p5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fadhil Ramadhan
 */
public class JavaApplication1 {
    private static int totBayar=0; 
    public static void main(String[] args) {
        ArrayList<Pesan> p = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
 
       do{
           /*
           jika pilih 1, maka input data, 
           jika 2, maka tampilkan data
           jika 3 maka keluar sistem
           */
 
            System.out.println("----------------------------");
            System.out.println("--- BINTANG BUCK COFFEE ----");
            System.out.println("----------------------------");
            System.out.println("  1. Pembelian");
            System.out.println("  2. Bayar");
            System.out.println("  3. Keluar sistem");
            System.out.println("----------------------------");
            System.out.print("  Pilihanmu: ");
            pilihan = sc.nextInt();
 
           if(pilihan == 1 ){
               p = beli( p );
           }else if(pilihan == 2){
                p = bayar( p );
                if(totBayar > 0){
                    System.out.println("Bayar:");
                    Integer jmlUang = sc.nextInt();
                    if (jmlUang < totBayar){
                        do {
                            System.out.println("Uang Anda Kurang");
                            System.out.println("----------------");
                            System.out.println("Bayar:");
                            jmlUang = sc.nextInt();
                        }while (jmlUang < totBayar);

                        System.out.println("Kembalian : "+(jmlUang-totBayar));
                    }else{
                        System.out.println("Kembalian : "+(jmlUang-totBayar));
                    }
                    p.clear();
                }
           }
       }while (pilihan != 3);
 
    }
 
    private static ArrayList<Pesan> beli( ArrayList<Pesan> p ){ 
        Scanner sc = new Scanner(System.in);
        String nama, tipe, gula;
        Integer harga, qty;
        
 
        System.out.print("Nama: ");
        nama = sc.nextLine();
        if(!nama.equalsIgnoreCase("americano") && !nama.equalsIgnoreCase("latte")
                && !nama.equalsIgnoreCase("arabika")){
            do{
                System.out.println("Nama Pesanan Tidak Sesuai");
                System.out.println("-------------------------");
                System.out.println("Nama : ");
                nama = sc.nextLine();
            }while(!nama.equalsIgnoreCase("americano") && !nama.equalsIgnoreCase("latte")
                    && !nama.equalsIgnoreCase("arabika"));
        }
        System.out.print("Tipe: ");
        tipe = sc.nextLine();
 
        System.out.print("Gula: ");
        gula = sc.nextLine();
 
        System.out.print("Harga: ");
        harga = sc.nextInt();
 
        System.out.print("Qty: ");
        qty = sc.nextInt();
        
        if(qty <= 0){
            do{
                System.out.println("Qty minimal 1 ");
                System.out.println("--------------");
                System.out.println("Qty : ");
                qty = sc.nextInt();
            }while (qty <= 0);
        }
        
        p.add( new Pesan( nama, tipe, gula, harga, qty ) );
 
        return p;
    }
 
    private static ArrayList<Pesan> bayar( ArrayList<Pesan> p ){
        Scanner sc = new Scanner(System.in);
 
        //tampilkan data 
        System.out.println("Jumlah data: "+ p.size()); //ini error
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s | %-3s  | %-7s |", 
                "No",
                "Nama",
                "Tipe",
                "Gula",
                "Harga",
                "Qty",
                "Jumlah");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
 
        for(int i = 0; i < p.size(); i++ ){
            System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s | %-3s  | %-7s |", 
                i + 1,
                p.get(i).getNama(),
                p.get(i).getTipe(),
                p.get(i).getGula(),
                p.get(i).getHarga(),
                p.get(i).getQty(),
                (p.get(i).getHarga() * p.get(i).getQty()));
            totBayar = totBayar+(p.get(i).getHarga()*p.get(i).getQty());
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
 
        }
        System.out.println("Total : "+totBayar);

        if(totBayar==0){
            System.out.println("Tekan Enter...");
            sc.nextLine();
        }
        
        
        System.out.println("Tekan enter untuk lanjut...");
        sc.nextLine();
 
        return p;
    }
}

