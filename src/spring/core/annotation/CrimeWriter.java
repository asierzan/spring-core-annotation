package spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CrimeWriter implements BookWriter {
	
	private Review review;
	
	@Autowired
	public CrimeWriter(@Qualifier("criticalReview")Review theReview) {
		this.review = theReview;
	}
	

	@Override
	public String writtenBook() {
		return "The Shining";
	}

}
