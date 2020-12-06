package spring.core.annotation.noXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring.core.annotation.noXml")
@PropertySource("classpath:bookDetails.properties")
public class ConfigurationClass {
	
	@Bean
	public Review goodReviewOfBook() {
		GoodReview goodReview = new GoodReview();
		return goodReview;
	}
	
	@Bean
	public BookWriter crimeBookWriter() {
		CrimeWriter crimeWriter = new CrimeWriter(goodReviewOfBook());
		return crimeWriter;
	}
	
	@Bean
	public BookWriter poetryBookWriter() {
		PoetryWriter poetryWriter = new PoetryWriter();
		return poetryWriter;
	}

}
