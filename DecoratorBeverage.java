public class DecoratorBeverage implements Beverage {
    private Beverage beverage;

    public DecoratorBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
