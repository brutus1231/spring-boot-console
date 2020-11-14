package pl.sda.springbootconsole;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class WorkDayCalculator {

    public boolean check(Date date) {
        return date.getDay() > 4;
    }
}
