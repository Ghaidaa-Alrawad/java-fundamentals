package inheritance.app.src.main.java.inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = Math.max(0, Math.min(5, stars));
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", restaurant='" + restaurant.getName() + '\'' +
                '}';
    }
}