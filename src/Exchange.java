import java.lang.reflect.Array;

public record Exchange(String base_code,String timetime_last_update_utc,String time_next_update_utc, Object conversion_rates) {
}
