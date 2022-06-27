package sealed_class_interface_examples;

public final class Car extends Vehicle implements VehicleService {
    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
