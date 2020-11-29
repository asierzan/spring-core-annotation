package spring.core.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomReview implements Review {
	
	private String[] randomReviews= {"This book is real page-turner", "I barely got through it","Bland and boring"};
	
	private Random random = new Random();

	@Override
	public String getReview() {
		int point = random.nextInt(randomReviews.length);
		String review = randomReviews[point];
		return review;
	}

}
