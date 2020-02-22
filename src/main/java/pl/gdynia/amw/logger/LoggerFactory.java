package pl.gdynia.amw.logger;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoggerFactory {

    private static LoggerFactory INSTANCE = new LoggerFactory();

    @Getter @Setter private Logger logger;

    public static LoggerFactory getInstance() {
        return INSTANCE;
    }
}
