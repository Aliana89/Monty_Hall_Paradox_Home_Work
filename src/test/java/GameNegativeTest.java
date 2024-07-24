import org.example.Game;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameNegativeTest extends BaseGameTest {

    @Test
    void throwExceptionWhenChoosingInvalidDoor() {
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);


        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            game.round(5); // Invalid index
        });
    }
}
