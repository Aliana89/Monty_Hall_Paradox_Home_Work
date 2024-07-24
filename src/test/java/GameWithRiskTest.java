import org.example.Door;
import org.example.Game;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class GameWithRiskTest extends BaseGameTest {

    static Stream<Arguments> doorChoiceProvider() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("doorChoiceProvider")
    void winLossBasedOnChoice(int doorIndex, boolean expectedResult) {
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);

        Door door = game.round(doorIndex);

        Assertions.assertEquals(expectedResult, door.isPrize());
    }
}