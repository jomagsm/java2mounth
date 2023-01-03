public class CarManufacturer {
    public CarManufacturer(String name, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }

    private String name;
    private String countryOfOrigin;

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getInfo() {
        return "Company name: " + name +
                "\nCountry of origin: " + countryOfOrigin;
    }
}
