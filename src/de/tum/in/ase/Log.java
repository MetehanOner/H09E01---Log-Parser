package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.time.LocalDateTime;

/**
 * Represents a line of log.
 */
public class Log {

    private @NonNull LocalDateTime dateTime;

    private @NonNull Level level;

    private @NonNull String message;

    public Log(@NonNull LocalDateTime dateTime,
               @NonNull Level level,
               @NonNull String message) {
        this.dateTime = dateTime;
        this.level = level;
        this.message = message;
    }

    public @NonNull LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(@NonNull LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public @NonNull Level getLevel() {
        return level;
    }

    public void setLevel(@NonNull Level level) {
        this.level = level;
    }

    public @NonNull String getMessage() {
        return message;
    }

    public void setMessage(@NonNull String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]: %s", getDateTime(), getLevel(), getMessage());
    }
}
