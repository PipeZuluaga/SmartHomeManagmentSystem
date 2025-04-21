public class SmartThermostat extends SmartDevice{
    private int temperature;

    public SmartThermostat(String brand, String model){
        super(brand, model);
        this.temperature = 20;
    }
    void setTemperature(int temperature){
        if (temperature < 10 || temperature>30){
            System.out.println("Valor invalido de temperatura");
        }else {
            this.temperature = temperature;
            System.out.println("Temperatura cambiada a: " + temperature);
        }
    }
    public void increaseTemperature(){
        setTemperature(temperature+1);
    }
    public void decreaseTemperature(){
        setTemperature(temperature-1);
    }
    public void isEnergySavingMode() {
        if (temperature <= 20){
            System.out.println("El modo ahorro de energia esta activado");
        }else{
            System.out.println("El modo ahorro de energia esta desactivado");

        }
    }
    @Override
    public String deviceinfo(){
        return "SmartThermostat - Brand: " + brand + " Model: "+ model + ", Status: " + getstatus() + "Temperatura: " + temperature + "°C";
    }
}
