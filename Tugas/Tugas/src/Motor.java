public class Motor {
    private String Merk;
    private String Warna;

    public void setMerk(String a){
        Merk = a;
    } 
    public String getMerk(){
        return Merk;
    } 
    public void setWarna(String a){
        Warna = a;
    } 
    public String getWarna(){
        return Warna;
    } 
    public void cetakInformasi(){
        System.out.println("Merk : " + Merk);
        System.out.println("Warna : " + Warna);
    }
}
