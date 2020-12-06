package spring.core.annotation.noXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.annotation.noXml.BookWriter;
import spring.core.annotation.noXml.ConfigurationClass;

public class MainNoXML {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		BookWriter crimeWriter = context.getBean("crimeBookWriter",BookWriter.class);
		CrimeWriter crimeWriterInst = context.getBean("crimeBookWriter",CrimeWriter.class);
		BookWriter poetryWriter = context.getBean("poetryBookWriter",BookWriter.class);
		
		System.out.println("Written book: "+crimeWriter.writtenBook());
		System.out.println("Author: "+crimeWriterInst.getAuthor());
		
		System.out.println("Written book: "+poetryWriter.writtenBook());
		
		context.close();

	}

}
