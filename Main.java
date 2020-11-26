
import java.util.Scanner;


public class Main {
    public static void faktoriyel(){
        Scanner scn = new Scanner(System.in);
                System.out.println("***********************************************");

        System.out.println("---parametresiz faktoriyel fonksiyonuna hoşgeldiniz---");
        System.out.println("Lütfen bir sayı giriniz : ");
        
        int sayı = scn.nextInt();
        int faktoriyel = 1;
        while(sayı>=1){
            faktoriyel *= sayı;
            sayı--;
            
        }
        System.out.println("faktöriyel = " +faktoriyel);
    }
    
    public static void toplama(){
        int a;int b;int c;
        Scanner scn = new Scanner(System.in);
                System.out.println("***********************************************");
        System.out.println(":::: parametresiz toplama fonksiyonu işlemini hoşgeldiniz ::::");
        System.out.println("Lütfen a degeri için bir sayı giriniz :");
        a = scn.nextInt();
        System.out.println("Lütfen b değeri için bir sayı giriniz : ");
        b = scn.nextInt();
        System.out.println("Lütfen c değeri için bir sayı giriniz :");
        c = scn.nextInt();
        System.out.println("toplam sonuç ;" +(a+b+c));
    }  /*
    parametreli fonksiyonlar
    
    */
    public static void parametre_toplama(int a,int b,int c){
        System.out.println("parametre gönderilmiş işleminizin sonucu :" +(a+b+c));
    }
    public static void parametreli_isim(String isim){
        System.out.println("***********************************************");
        System.out.println("---SEVDİĞİNİN İSMİNİ 40000 KEZ YAZDIRAN O MEŞHUR PROGRAM BURADA KULLAN VE MUTLU OL---");
        //Scanner scn =  new Scanner(System.in);
        //System.out.println("Lütfen bir isim girşinde bulununuz : ");
        for(int i = 0;i<=40000;i++){
            System.out.println(isim +" seni seviyor bizden söylemesi :) imza : @prince");
        }

    }
    public static void parametreli_parametresiz_ortak(String isim){
        Scanner scn =  new Scanner(System.in);
        System.out.println("Lütfen sevdiğiniz kişinin ismini giriniz bulununuz : ");
        String sevilen = scn.nextLine();
        System.out.println("*****************************************************");
         for(int i = 0;i<=41;i++){
            System.out.println(isim +" seni seviyor bizden söylemesi :) imza : @prince " +sevilen +" seviyorsan git saçını çek bence :)");
        }
    }
    public static void main(String[] args) {
        
        faktoriyel();
        System.out.println("***********************************************");
        toplama();
        System.out.println("***********************************************");
        parametre_toplama(99, 58, 85);
        parametreli_isim("nil");
        parametreli_parametresiz_ortak("kfn");
    }
  
    
}
