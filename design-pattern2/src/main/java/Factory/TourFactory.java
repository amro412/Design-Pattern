package Factory;

public class TourFactory implements ITourFactory {

    public Egypt getCityByCode(int code) {
        for (City city : City.values()) {
            if (code == city.ordinal()) {
                return city.getCityInstance();
            }
        }
        return null;
    }
}
