package spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Novelist implements BookWriter {

	private Review review;
	
	public Novelist() {
		
	}
	
	@Autowired
	@Qualifier("goodReview")
	public void readBook(Review theReview) {
		System.out.println("***Book is being read***");
		System.out.println(theReview.getReview());
		this.review=theReview;
	}
	
	@Override
	public String writtenBook() {
		return "Rebeka";
	}

}
