package inheritance.app.src.main.java.inheritance;

public class Restaurant extends Place{
    private int priceCategory;


    public Restaurant(String name, String description, int stars, int priceCategory) {
        super(name, description, stars);
        this.priceCategory = priceCategory;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "name of the restaurant='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", stars=" + getStars() +
                ", priceCategory=" + priceCategory +
                '}';
    }




}
