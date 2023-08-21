package inheritance.app.src.test.java.inheritance;

import inheritance.app.src.main.java.inheritance.Restaurant;
import inheritance.app.src.main.java.inheritance.Review;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantReviewTest {

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Pizza Restaurant", 4, 2);
        String expectedToString = "Restaurant{name='Pizza Restaurant', stars=4, priceCategory=2}";
        assertEquals(expectedToString, restaurant.toString());
    }

    @Test
    public void testReviewToString() {
        Restaurant restaurant = new Restaurant("Burger Restaurant", 4, 2);
        Review review = new Review("Great food!", "Ghaidaa", 5, restaurant);
        String expectedToString = "Review{body='Great food!', author='Ghaidaa', stars=5, restaurant='Burger Restaurant'}";
        assertEquals(expectedToString, review.toString());
    }


    @Test
    public void testRestaurantAddReview() {
        Restaurant restaurant = new Restaurant("Japanese Restaurant", 4, 2);
        Review review = new Review("Great food!", "Ghaidaa", 5, restaurant);
        assertEquals(5, restaurant.getStars()); // Initial review, so average is 5

        Review anotherReview = new Review("Average", "Ghaidaa", 3, restaurant);
        assertEquals(4, restaurant.getStars()); // Average is (5 + 3) / 2 = 4
    }

}
