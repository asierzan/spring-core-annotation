package spring.core.annotation.noXml;

import org.springframework.stereotype.Component;

@Component
public class GoodReview implements Review {

	@Override
	public String getReview() {
		return "Excellent book!";
	}

}
