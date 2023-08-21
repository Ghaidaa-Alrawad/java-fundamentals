package inheritance.app.src.main.java.inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = Math.max(0, Math.min(5, stars)); //because it's from 1-5
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
        updateStars();
    }

    private void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        if (!reviews.isEmpty()) {
            stars = totalStars / reviews.size();
        } else {
            stars = 0;
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                '}';
    }
}
