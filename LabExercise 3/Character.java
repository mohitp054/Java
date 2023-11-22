final class Character extends Anime {
    private String characterName;

    public Character(String animeName, String characterName) {
        super(animeName);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    // Overriding the displayInfo method from the base class
    @Override
    public void displayInfo() {
        System.out.println("Anime: " + getName() + ", Character: " + characterName);
    }
}
