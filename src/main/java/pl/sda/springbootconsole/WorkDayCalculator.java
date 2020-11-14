package pl.sda.springbootconsole;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Profile("development")
public class WorkDayCalculator {

    public boolean check(Date date) {
        return date.getDay() > 4;
    }
}
