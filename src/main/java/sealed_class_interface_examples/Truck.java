package sealed_class_interface_examples;

public non-sealed class Truck extends Vehicle implements VehicleService {
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 24;
    }
}
