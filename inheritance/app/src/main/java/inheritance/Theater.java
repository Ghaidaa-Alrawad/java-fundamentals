package inheritance.app.src.main.java.inheritance;

import java.util.ArrayList;

public class Theater extends Place{

    private ArrayList<String> movies;

    public Theater(String name, String description, int stars) {
        super(name, description,stars);
        this.movies = new ArrayList<>();
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name of the theater='" + getName() + '\'' +
                "description='" + getDescription() + '\'' +
                ", stars=" + getStars() +
                "movies=" + movies +
                '}';
    }
}
