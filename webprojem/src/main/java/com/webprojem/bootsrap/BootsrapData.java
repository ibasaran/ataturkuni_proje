package com.webprojem.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webprojem.domain.Author;
import com.webprojem.domain.Book;
import com.webprojem.domain.Publisher;
import com.webprojem.repository.AuthorRepository;
import com.webprojem.repository.BookRepository;
import com.webprojem.repository.PublisherRepository;

@Component
public class BootsrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootsrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Author mehmet = new Author();
		mehmet.setFirstName("Mehmet");
		mehmet.setLastName("Hakkı");
		
		Book kitap1 = new Book();
		kitap1.setTitle("Sefiller");
		kitap1.setIsbn("12S3T56G");
		
		Publisher publisher = new Publisher();
		publisher.setPublisherName("İş Bankası Yayınları");
		publisher.setAddress("Ankara");
		publisher.setCity("Ankara");
		
		Author mehmetSaved = authorRepository.save(mehmet);
		Book kitap1Saved = bookRepository.save(kitap1);
		Publisher publisherSaved = publisherRepository.save(publisher);
		
		kitap1Saved.getAuthors().add(mehmetSaved);
		kitap1Saved.setPublisher(publisherSaved);
		mehmetSaved.getBooks().add(kitap1Saved);
		
		publisherSaved.getBooks().add(kitap1Saved);
		
		authorRepository.save(mehmetSaved);
		bookRepository.save(kitap1Saved);
		publisherRepository.save(publisherSaved);
		
		
		System.out.println("Author count -> " + authorRepository.count());
		System.out.println("Book count -> " + bookRepository.count());
		System.out.println("Publisher count -> " + publisherRepository.count());
		
		
		System.out.println("UYGULAMA AYAGA KALKARKEN BENI CAGIRDI");
		
		
	}

}
