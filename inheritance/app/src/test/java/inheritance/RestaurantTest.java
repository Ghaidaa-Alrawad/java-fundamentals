package inheritance.app.src.test.java.inheritance;

import inheritance.app.src.main.java.inheritance.Restaurant;
import inheritance.app.src.main.java.inheritance.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void testRestaurantReview() {
        Restaurant restaurant = new Restaurant("Tasty Bites", "Delicious food", 4, 2);
        Review review = new Review("Great food and atmosphere", "Ghaidaa", 5, restaurant);

        String expectedReviewString = "Review{place ='Tasty Bites', body='Great food and atmosphere', author='Ghaidaa', stars=5}";
        assertEquals(expectedReviewString, review.toString());
    }

}
