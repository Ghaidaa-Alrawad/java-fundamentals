package inheritance.app.src.main.java.inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;
    private Shop shop;

    private Theater theater;


    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = Math.max(0, Math.min(5, stars));
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }


    public Review(String body, String author, int stars, Shop shop) {
        this.body = body;
        this.author = author;
        this.stars = Math.max(0, Math.min(5, stars));
        this.shop = shop;
        shop.addReview(this);
    }

    public Review(String body, String author, int stars, Theater theater) {
        this.body = body;
        this.author = author;
        this.stars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        theater.addReview(this);
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

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setMovie(String movie) {
        if (theater != null) {
            theater.addMovie(movie);
        }
    }


    @Override
    public String toString() {
        String restaurantName = (restaurant != null) ? restaurant.getName() : "No restaurant";
        String shopName = (shop != null) ? shop.getName() : "No shop";
        String theaterName = (theater != null) ? theater.getName() : "No theater";

        String placeName;
        if (restaurant != null) {
            placeName = restaurantName;
        } else if (shop != null) {
            placeName = shopName;
        } else {
            placeName = theaterName;
        }

        String movieInfo = "";
        if (theater != null && theater.getMovies().size() > 0) {
            movieInfo = ", Movie: " + theater.getMovies().get(0);
        }

        if (theater != null && theater.getMovies().size() == 0) {
            movieInfo = ", No movie just here to eat :D";
        }

        return "Review{" +

                "place ='" + placeName  + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                movieInfo +
                '}';
    }


}
