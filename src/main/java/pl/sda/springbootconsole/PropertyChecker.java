package pl.sda.springbootconsole;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyChecker {

    @Value("${xxx}")
    private String xxx;

    public String print() {
        return xxx;
    }
}
