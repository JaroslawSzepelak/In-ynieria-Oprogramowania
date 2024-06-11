package factoryMethod;

public class IntegerProduct implements NumberProduct {
    private Integer value;

    public IntegerProduct(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
