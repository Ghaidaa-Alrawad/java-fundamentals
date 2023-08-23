package inheritance.app.src.test.java.inheritance;

import inheritance.app.src.main.java.inheritance.Theater;
import inheritance.app.src.main.java.inheritance.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterReviewWithoutMovie() {
        Theater theater = new Theater("Wacky Wizardry Theatre", "Great movie experience", 4);
        Review review = new Review("Awesome theater experience!", "Ghaidaa", 5, theater);

        String expectedReviewString = "Review{place ='Wacky Wizardry Theatre', body='Awesome theater experience!', author='Ghaidaa', stars=5, No movie just here to eat :D}";
        assertEquals(expectedReviewString, review.toString());
    }

    @Test
    public void testTheaterReviewWithMovie() {
        Theater theater = new Theater("Wacky Wizardry Theatre", "Great movie experience", 4);
        theater.addMovie("Fantastic Beasts");
        Review review = new Review("Fantastic movie!", "Ghaidaa", 5, theater);

        String expectedReviewString = "Review{place ='Wacky Wizardry Theatre', body='Fantastic movie!', author='Ghaidaa', stars=5, Movie: Fantastic Beasts}";
        assertEquals(expectedReviewString, review.toString());
    }
}
