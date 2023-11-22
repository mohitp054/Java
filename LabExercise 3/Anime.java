public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Anime: " + name);
    }
}