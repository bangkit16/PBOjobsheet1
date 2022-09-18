public class Kompor {
    private String Merk;
    private String Ukuran;

    public void setMerk(String a){
        Merk = a;
    } 
    public String getMerk(){
        return Merk;
    } 
    public void setUkuran(String a){
        Ukuran = a;
    } 
    public String getUkuran(){
        return Ukuran;
    } 
    public void cetakInformasi(){
        System.out.println("Merk : " + Merk);
        System.out.println("Ukuran : " + Ukuran);
    }
}
