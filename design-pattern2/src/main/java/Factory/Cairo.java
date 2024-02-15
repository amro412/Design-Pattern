package Factory;

public class Cairo implements Egypt {

    public void customCairoDisplay() {
        System.out.println("Cairo places ..........");
    }

    public String displayTheBestPlaces() {
        return "Khan el-Khalili, The Egyptian Museum, Al-Azhar Mosque, ......";
    }

}
