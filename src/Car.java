public class Car implements Comparable<Car> {
    private String brand;
    private String modelName;
    private long modelyear;

    @Override
    public int compareTo(Car other) {

        if (this.modelyear == other.modelyear) {
            return 0;
        }
        return this.modelyear > other.modelyear ? 1 : -1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public long getModelyear() {
        return modelyear;
    }

    public void setModelyear(long modelyear) {
        this.modelyear = modelyear;
    }

    @Override
    public String toString() {
        return brand + " " + modelName + " - " + modelyear;
    }
}
