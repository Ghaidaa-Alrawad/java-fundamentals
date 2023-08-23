package inheritance.app.src.main.java.inheritance;

import java.util.ArrayList;

public abstract class Place implements Reviewable{
    private String name;
    private String description;
    private ArrayList<Review> reviews;

    private int stars;

    public Place(String name, String description, int stars) {
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.reviews = new ArrayList<>();
    }


    @Override
    public void addReview(Review review) {
        reviews.add(review);
        updateStars();
    }

    public void updateStars() {
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
    public String getName() {
        return name;
    }

    @Override
    public int getStars(){
        return stars;
    }

    @Override
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String getDescription(){
        return description;
    }

}
