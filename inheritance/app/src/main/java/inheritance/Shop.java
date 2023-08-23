package inheritance.app.src.main.java.inheritance;

public class Shop extends Place{
    private int numberOfDollarSigns;


    public Shop(String name, String description, int stars, int numberOfDollarSigns) {
        super(name, description, stars);
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void setNumberOfDollarSigns(int numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop2{" +
                "name of the shop='" + getName() + '\'' +
                "description='" + getDescription() + '\'' +
                ", stars=" + getStars() +
                "numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }
}
