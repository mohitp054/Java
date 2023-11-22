class ActionGenre extends Genre {

    public ActionGenre(String genreName) {
        super(genreName);
    }

    // Implementing the abstract method from the Genre class
    @Override
    public void displayGenreInfo() {
        System.out.println("Genre: " + getGenreName() + " (Action)");
    }
}