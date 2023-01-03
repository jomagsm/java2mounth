final class CarForSale extends Car {
    public CarForSale(int mileage, String model, TypeOfCarEnum type, int doors, CarManufacturer manufacturer,
            Engine engine, float priceOfEntry, float salesPrice) {
        super(mileage, model, type, doors, manufacturer, engine);
        this.priceOfEntry = priceOfEntry;
        this.salesPrice = salesPrice;
    }

    private float priceOfEntry;
    private float salesPrice;

    public float getPriceOfEntry() {
        return priceOfEntry;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    @Override
    public void beepSound() {
        System.out.println("BiBiBiP");
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + "\nPrice of entry: " + priceOfEntry
                + "\nSales price: " + salesPrice;
    }

}
