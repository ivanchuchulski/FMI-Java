package exercise1.Zad1;

public class Thermometer {
    private double measurement;

    // constructors
    public Thermometer() {
        this.measurement = 0.0;
    }

    public Thermometer(double measurement) {
        setMeasurement(measurement);
    }

    // setter
    public void setMeasurement(double measurement) {
        if (measurement < -273) {
            this.measurement = 0.0;
        }
        else {
            this.measurement = measurement;
        }
    }

    // getter
    public double getMeasurement() {
        return this.measurement;
    }

    public double convertToCelsius() {
        double measurementInCelsius =  5.0 / 9.0 * (this.measurement - 32);

        return measurementInCelsius;
    }

    public double convertToFahrenheit() {
        double measurementInFahrenheit = 9.0 / 5.0 * this.measurement + 32;

        return measurementInFahrenheit;
    }

    @Override
    public String toString() {
        return String.format("thermometer value = %.2f", this.measurement);
    }
}
