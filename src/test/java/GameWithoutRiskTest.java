
import org.example.Door;
import org.example.Game;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameWithoutRiskTest extends BaseGameTest {


    @Test
    void shouldWinWhenChoosingPrizeDoor() {
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);

        Door door = game.round(0);

        Assertions.assertTrue(door.isPrize());
    }

    @Test
    void shouldLoseWhenChoosingNonPrizeDoor() {
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);

        Door door = game.round(1);

        Assertions.assertFalse(door.isPrize());
    }

}