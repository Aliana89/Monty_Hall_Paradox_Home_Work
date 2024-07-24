import org.example.Game;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameNegativeTest extends BaseGameTest {

    @Test
    void shouldThrowExceptionWhenChoosingInvalidDoor() {
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);

        // Assuming round method throws an exception for invalid door index
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            game.round(5); // Invalid index
        });
    }
}
