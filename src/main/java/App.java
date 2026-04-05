public class App {

    // 0 = available, 1 = booked
    static int[] slots = new int[5]; // 5 slots

    // book slot function
    public static String bookSlot(int slotIndex) {

        // check valid index
        if (slotIndex < 0 || slotIndex >= slots.length) {
            return "Invalid slot";
        }

        // check if already booked
        if (slots[slotIndex] == 1) {
            return "Slot already taken";
        }

        // book slot
        slots[slotIndex] = 1;
        return "Booking successful";
    }

    public static void main(String[] args) {
        System.out.println("Appointment Booking System Ready");
    }
}