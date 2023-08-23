package inheritance.app.src.main.java.inheritance;

import java.util.ArrayList;

public interface Reviewable {
    void addReview(Review review);
    String getName();
    int getStars();
    String getDescription();
    ArrayList<Review> getReviews();
    void updateStars();
}
