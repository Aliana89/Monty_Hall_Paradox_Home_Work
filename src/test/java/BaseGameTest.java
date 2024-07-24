
import org.example.Door;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseGameTest {
    protected List<Door> doors;

    @BeforeEach
    void initDoors() {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }
}