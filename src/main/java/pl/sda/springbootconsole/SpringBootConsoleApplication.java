package pl.sda.springbootconsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class SpringBootConsoleApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootConsoleApplication.class, args);
		System.out.println("Hello world!!");

//		WorkDayCalculator workingDayCalculator = context.getBean(WorkDayCalculator.class);
//		boolean isDayInWeekend = workingDayCalculator.check(new Date());
//		System.out.println("Dzień jest w weekend " + (isDayInWeekend ? "TAK" : "NIE"));

		String[] beans = context.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}
	}

}
