import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ekle();
        sil();
        güncelle();
        topla(12,15);
        int toplam =   topla(12,15,15,20,30,40,50);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi : sayilar){
            toplam += sayi;

        }
        return toplam;
    }

}

