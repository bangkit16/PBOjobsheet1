public class TugasDemo {
    public static void main(String[] args) {
        Kompor kompor = new Kompor();
        KomporGas komporGas = new KomporGas();
        Motor motor = new Motor();
        MotorMatic motorMatic = new MotorMatic();

        kompor.setMerk("Honichi");
        komporGas.setpanjangSelang(4);
        motor.setMerk("Honda");
        motorMatic.setBatasKecepatan(120);
    }
}
