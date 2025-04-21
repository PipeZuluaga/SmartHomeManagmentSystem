public class Main {
    public static void main(String[] args) {
    SmartLight light= new SmartLight("Kalley", "Home");
    SmartThermostat thermostat= new SmartThermostat("Nest", "Tado");

    light.turnOn();
    thermostat.turnOn();
    System.out.println(light.deviceinfo());
    System.out.println(thermostat.deviceinfo());
    light.changeColor("Azul");
    light.adjustBrightness(75);
    thermostat.setTemperature(22);
    thermostat.increaseTemperature();
    thermostat.decreaseTemperature();
    thermostat.isEnergySavingMode();
    }
}