import java.util.*;
class Event {
    String title;
    String time;
    String description;
    public Event(String title, String time, String description) {
        this.title = title;
        this.time = time;
        this.description = description;
    }
    public String toString() {
        return time + " - " + title + ": " + description;
    }
}
public class EventCalendar {
    public static void main(String[] args) {
        TreeMap<String, List<Event>> calendar = new TreeMap<>();
        addEvent(calendar, "2025-05-15", new Event("Doctor Appointment", "10:00 AM", "Annual check-up"));
        addEvent(calendar, "2025-05-15", new Event("Meeting", "2:00 PM", "Project discussion"));
        addEvent(calendar, "2025-05-20", new Event("Friend's Birthday", "All Day", "Buy gift"));
        removeEvent(calendar, "2025-05-15", "Meeting");
        displayEventsOnDate(calendar, "2025-05-15");
        displayAllEvents(calendar);
    }
    public static void addEvent(TreeMap<String, List<Event>> calendar, String date, Event event) {
        calendar.putIfAbsent(date, new ArrayList<>());
        calendar.get(date).add(event);
    }
    public static void removeEvent(TreeMap<String, List<Event>> calendar, String date, String title) {
        if (calendar.containsKey(date)) {
            calendar.get(date).removeIf(e -> e.title.equalsIgnoreCase(title));
        }
    }
    public static void displayEventsOnDate(TreeMap<String, List<Event>> calendar, String date) {
        System.out.println("\nEvents on " + date + ":");
        List<Event> events = calendar.get(date);
        if (events == null || events.isEmpty()) {
            System.out.println("No events found.");
        } else {
            for (Event e : events) {
                System.out.println("  " + e);
            }
        }
    }
    public static void displayAllEvents(TreeMap<String, List<Event>> calendar) {
        System.out.println("\nAll Upcoming Events:");
        for (Map.Entry<String, List<Event>> entry : calendar.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Event e : entry.getValue()) {
                System.out.println("  " + e);
            }
        }
    }
}
