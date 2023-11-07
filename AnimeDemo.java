public class AnimeDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Anime anime1 = new Anime();
        anime1.displayInfo();

        // Using Constructor with two parameters
        Anime anime2 = new Anime("Naruto", "Action");
        anime2.displayInfo();

        // Using Constructor with all parameters
        Anime anime3 = new Anime("One Piece", "Adventure", 1000, 9.5);
        anime3.displayInfo();

        // Updating rating using different methods
        anime2.updateRating(8.7);
        anime2.updateRating("9.3");
        anime3.updateRating(9.8, 1010); // Updating both rating and episodes

        // Display updated info
        anime2.displayInfo();
        anime3.displayInfo();
    }
}