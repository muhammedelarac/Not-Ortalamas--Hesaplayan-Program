import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
//Değişenleri oluştur

int matematik,fizik,kimya,turkce,tarih,muzik;

// Scanner sınıfımızı tamamladık

Scanner inp =new Scanner(System.in);

// Kullancıdan değelerı al

System.out.println("Matematik Notunuzu Yazınız: ");
matematik = inp.nextInt();

System.out.println("Fizik Notunuzu Yazınız: ");
fizik = inp.nextInt();

System.out.println("Kimya Notunuzu Yazınız: ");
kimya = inp.nextInt();

System.out.println("Türkçe Notunuzu Yazınız: ");
turkce = inp.nextInt();

System.out.println("Tarih Notunuzu Yazınız: ");
tarih = inp.nextInt();

System.out.println("Müzik Notunuzu Yazınız: ");
muzik = inp.nextInt();

//Toplam hesaplaması

int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);

double sonuc = toplam/6;

System.out.println("Sonucunuz : " + sonuc);


// Sınıf Geçtin Tebrikler / Sınıfta Kaldın Malesf

boolean kosul1 = sonuc== 50;
boolean kosul2 = sonuc>=50;

boolean sonuc1 =kosul1||kosul2; 

String str =(sonuc1)? "*****Sınıf Geçtin Tebrikler*****": "Malesef Sınıfta Kaldın ";

System.out.println(str);


System.out.println("|Program Bitti");

    }
    
}





