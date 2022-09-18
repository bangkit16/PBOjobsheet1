public class MotorMatic extends Motor{
    private int BatasKecepatan;
    private String jenis ;

    public void setBatasKecepatan(int a){
        BatasKecepatan = a;
    } 
    public int getBatasKecepatan(){
        return BatasKecepatan;
    } 
    public void setjenis(String a){
        jenis = a;
    } 
    public String getjenis(){
        return jenis;
    } 
    public void cetakInformasi(){
        System.out.println("Batas Kecepatan : " + BatasKecepatan);
        System.out.println("jenis : " + jenis);
    }
}
