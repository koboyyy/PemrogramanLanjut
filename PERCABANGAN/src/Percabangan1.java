public class Percabangan1 {
    public static void main(String[] args) {

//        Pembelian Pertama
        int pembelianPertama = 79500;

        System.out.println("Pembelian pertama: Rp. " + pembelianPertama);

        if(pembelianPertama < 100000){
            System.out.println("Anda tidak mendapatkan potongan harga");
        }else if (pembelianPertama >= 100000){
            System.out.println("Anda mendapatkan potongan harga sebesar 15% dari total pembelian");
        }

//        Pembelian Kedua
        int pembelianKedua = 210000;

        System.out.println("Pembelian Kedua: Rp. " + pembelianKedua);

        if(pembelianKedua < 100000){
            System.out.println("Anda tidak mendapatkan potongan harga");
        }else if (pembelianKedua >= 100000){
            System.out.println("Anda mendapatkan potongan harga sebesar 15% dari total pembelian");
        }
    }
}
