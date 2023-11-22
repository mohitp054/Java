abstract class Genre {
    private String genreName;

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayGenreInfo();
}