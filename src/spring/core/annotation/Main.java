package spring.core.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		
		BookWriter theCrimeWriter = context.getBean("crimeWriter",CrimeWriter.class);
		BookWriter thePoetryWriter = context.getBean("poetryWriter", PoetryWriter.class);
		Novelist theNovelist =context.getBean("novelist",Novelist.class);
		RomanceWriter theRomanceWriter = context.getBean("romanceWriter", RomanceWriter.class);
		
		Review goodReview = context.getBean("goodReview",GoodReview.class);
		Review criticalReview = context.getBean("criticalReview",CriticalReview.class);
		Review randomReview = context.getBean("randomReview",RandomReview.class);
		Review randomReviewFromFile = context.getBean("reviewFromFile", ReviewFromFile.class);
		
		
		System.out.println("Written book: "+ theCrimeWriter.writtenBook());
		System.out.println("Review: "+ goodReview.getReview());
		
		System.out.println("Written book: "+thePoetryWriter.writtenBook());
		System.out.println("Review: "+ criticalReview.getReview());
		
		System.out.println("Written book: "+ theNovelist.writtenBook());
			
		System.out.println("Written book: "+ theRomanceWriter.writtenBook());
		System.out.println("Random review: "+ randomReview.getReview());
		System.out.println(theRomanceWriter.toString());
		
		System.out.println("Random review from file: "+ randomReviewFromFile.getReview());
			
		context.close();

	}

}
