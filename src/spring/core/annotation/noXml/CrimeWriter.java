package spring.core.annotation.noXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CrimeWriter implements BookWriter {

	private Review review;
	
	@Value("{book.author}")
	private String author;
	
	public CrimeWriter(Review goodBookReview) {
		this.review=goodBookReview;
	}

	@Override
	public String writtenBook() {
		return "The Shining";
	}

	@Override
	public String bookAuthor() {
		return "Stephen King";
	}

	@Override
	public String getBookReview() {
		return review.getReview();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
 
	
	
}
