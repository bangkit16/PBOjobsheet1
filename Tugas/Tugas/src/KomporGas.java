public class KomporGas extends Kompor{
    private String ukuranGas;
    private int panjangSelang ;

    public void setUkuranGas(String a){
        ukuranGas = a;
    } 
    public String getUkuranGas(){
        return ukuranGas;
    } 
    public void setpanjangSelang(int a){
        panjangSelang = a;
    } 
    public int getpanjangSelang(){
        return panjangSelang;
    } 
    public void cetakInformasi(){
        System.out.println("Ukuran Gas : " + ukuranGas);
        System.out.println("Panjang Selang : " + panjangSelang);
    }
}
