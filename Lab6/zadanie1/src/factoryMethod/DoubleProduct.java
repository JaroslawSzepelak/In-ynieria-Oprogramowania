package factoryMethod;

public class DoubleProduct implements NumberProduct {
    private Double value;

    public DoubleProduct(Double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
