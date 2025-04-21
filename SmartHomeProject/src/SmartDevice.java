public abstract class SmartDevice {
    String brand;
    String model;
    boolean status;
    public SmartDevice(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.status = false;
    }
    public void turnOn(){
    this.status = true;
    System.out.println(model+" esta encendido");
    }

    public void turnOff(){
    this.status = false;
    System.out.println(model+" esta apagado");
    }
    public String getstatus(){
        return status ? "ENCENDIDO":"APAGADO";
    }
    public abstract String deviceinfo();

}
