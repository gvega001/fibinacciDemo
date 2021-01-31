package online.dev4you;

import java.time.Duration;
import java.time.Instant;

class TimeDate {
    public Instant start;
    public Instant end;

    //return total time in seconds
    public double timeInSeconds() {
        return Duration.between(start, end).toMillis() / 1000.0;
    }
}
public class FibonacciDemo {
}
