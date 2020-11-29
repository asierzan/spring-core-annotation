package spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PoetryWriter implements BookWriter {

	private Review review;
	
	public PoetryWriter() {
	}
	
	@Autowired
	@Qualifier("goodReview")
	public void setReview(Review review) {
		this.review = review;
	}	
	
	@Override
	public String writtenBook() {
		return "Milk and Honey";
	}


	
}
