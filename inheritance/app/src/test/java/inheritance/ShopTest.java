package inheritance.app.src.test.java.inheritance;

import inheritance.app.src.main.java.inheritance.Shop;
import inheritance.app.src.main.java.inheritance.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    @Test
    public void testShopReview() {
        Shop shop = new Shop("SuperMart", "Convenient shopping", 4, 3);
        Review review = new Review("Good shopping experience", "Ghaidaa", 4, shop);

        String expectedReviewString = "Review{place ='SuperMart', body='Good shopping experience', author='Ghaidaa', stars=4}";
        assertEquals(expectedReviewString, review.toString());
    }
}
