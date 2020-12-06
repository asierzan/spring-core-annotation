package spring.core.annotation.noXml;

import org.springframework.stereotype.Component;

@Component
public class PoetryWriter implements BookWriter {

	private Review review;
	
	@Override
	public String writtenBook() {
		return "Milk and Honey";
	}

	@Override
	public String bookAuthor() {
		return "Kaur Rupi";
	}

	@Override
	public String getBookReview() {
		return review.getReview();
	}
	
}
