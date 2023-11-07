// A class to represent an anime
public class Anime {

    // Data members (fields)
    private String title; // Title of the anime
    private String genre; // Genre of the anime
    private int episodes; // Number of episodes
    private double rating; // Rating of the anime

    // Default Constructor
    public Anime() {
        this.title = "Unknown";
        this.genre = "Unknown";
        this.episodes = 0;
        this.rating = 0.0;
    }

    // Constructor Overloading

    // Constructor with title and genre
    public Anime(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.episodes = 0; // Default number of episodes
        this.rating = 0.0; // Default rating
    }

    // Constructor with all parameters
    public Anime(String title, String genre, int episodes, double rating) {
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
        this.rating = rating;
    }

    // Methods

    // Accessor methods (getters)
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public double getRating() {
        return rating;
    }

    // Mutator methods (setters)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method Overloading

    // Method to update anime rating
    public void updateRating(double newRating) {
        this.rating = newRating;
    }

    // Method to update anime rating with string input
    public void updateRating(String newRating) {
        this.rating = Double.parseDouble(newRating);
    }

    // Method to update anime rating and episodes
    public void updateRating(double newRating, int newEpisodes) {
        this.rating = newRating;
        this.episodes = newEpisodes;
    }

    // Additional Method to display anime information
    public void displayInfo() {
        System.out.println("Anime Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Episodes: " + episodes);
        System.out.println("Rating: " + rating);
    }
}
