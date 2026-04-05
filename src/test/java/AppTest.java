import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    @BeforeEach
    void resetSlots() {
        App.slots = new int[5]; // reset before every test
    }

    @Test
    void testFirstBookingSuccess() {
        assertEquals("Booking successful", App.bookSlot(2));
    }

    @Test
    void testDoubleBookingFails() {
        App.bookSlot(3);
        assertEquals("Slot already taken", App.bookSlot(3));
    }

    @Test
    void testInvalidSlot() {
        assertEquals("Invalid slot", App.bookSlot(10));
    }
}