package spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class CriticalReview implements Review {

	@Override
	public String getReview() {
		return "That book was a torment.";
	}

}
