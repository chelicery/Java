import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.*;

class Gigasecond {
    protected LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime  = birthDate.atTime(0,0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
    return birthDateTime.plus(1_000_000_000, ChronoUnit.SECONDS);
    }

}