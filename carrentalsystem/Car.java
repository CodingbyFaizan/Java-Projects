
public class Car {

    private String carId;
    private String carName;
    private int basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String carName, int basePricePerDay, boolean isAvailable) {
        this.carId = carId;
        this.carName = carName;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public int getBasePricePerDay() {
        return basePricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent(){
        isAvailable = true;
    }
}
