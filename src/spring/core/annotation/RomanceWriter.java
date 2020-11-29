package spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RomanceWriter implements BookWriter {
	
	@Autowired
	@Qualifier("randomReview")
	private Review review;
	
	
	@Value("${book.numberOfPages}")
	private int numberOfPages;
	
	@Value("${book.author}")
	private String author;

	@Override
	public String writtenBook() {
		return "A Walk To Remember";
	}

	@Override
	public String toString() {
		return "RomanceWriter [numberOfPages=" + numberOfPages + ", author=" + author + "]";
	}

	
}
