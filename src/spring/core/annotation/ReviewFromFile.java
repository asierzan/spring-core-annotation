package spring.core.annotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ReviewFromFile implements Review {

	private String file = "O:/eclipse/books/src/reviewsFromFile.txt";
	private List<String> reviewsFromFile;
	
	private Random random = new Random();

	public ReviewFromFile() {
		File fileWithReviews = new File(file);
		System.out.println("Reading from file: " + fileWithReviews);
		reviewsFromFile = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileWithReviews))) {
			String line;

			while ((line = br.readLine()) != null) {
				reviewsFromFile.add(line);
			}

		} catch (IOException e) {
			System.out.println("Can not find file");
		}
	}

	@Override
	public String getReview() {
		int point= random.nextInt(reviewsFromFile.size());
		return reviewsFromFile.get(point) ;
	}

}
