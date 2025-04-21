public class SmartLight extends SmartDevice {
    int brightness;
    String color;
    public SmartLight(String brand,String model) {
        super(brand, model);
        this.brightness = 50;
        this.color = "red";
    }

    public void changeColor(String newcolor){
        this.color = newcolor;
        System.out.println(model+ " Color cambiado a: " + color);

    }
    public void adjustBrightness(int level){
        this.brightness = level;
        if (level >=0 && level <= 100){
            System.out.println(model+ " Brillo cambiado a: " + brightness);
        }else {
            System.out.println("El brillo debe estar entre 0 y 100");
        }
    }

    @Override
    public String deviceinfo(){
        return "Smartlight - Brand: " + brand + " Model: "+ model + ", Status: " + getstatus() + ", Color: " + color + ", Brightness:" + brightness;
    }
}
