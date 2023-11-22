public class AnimeApp {
    public static void main(String[] args) {
        // Creating an instance of the final class Character
        Character mainCharacter = new Character("Naruto", "Naruto Uzumaki");
        mainCharacter.displayInfo();

        // Creating an instance of the concrete class ActionGenre
        ActionGenre actionGenre = new ActionGenre("Action");
        actionGenre.displayGenreInfo();
    }
}