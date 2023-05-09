package com.webprojem.bootsrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webprojem.dao.EmployeeDao;
import com.webprojem.domain.Author;
import com.webprojem.domain.Book;
import com.webprojem.domain.Employee;
import com.webprojem.domain.Publisher;
import com.webprojem.repository.AuthorRepository;
import com.webprojem.repository.BookRepository;
import com.webprojem.repository.PublisherRepository;

@Component
public class BootsrapData implements CommandLineRunner {
	
	@Autowired
	private EmployeeDao employeeDao;
	
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
		kitap1.setPicture("https://i.dr.com.tr/cache/500x400-0/originals/0000000650749-1.jpg");
		kitap1.setDescription("Victor Hugo'nun 1862 tarihli başyapıtı Sefiller, ailesine ekmek götürebilmek için hırsızlık yapan ve bu yüzden kürek mahkûmiyetine çarptırılan bir adamın hikâyesi. Aldığı ağır cezanın bedelini ömrü boyunca ödeyen Jean Valjean'ı merkezine alan roman, yoksulluğu, toplumsal adaleti ve dayanışmayı anlatıyor.");
		
		Book kitap2 = new Book();
		kitap2.setTitle("Karanlık Orman");
		kitap2.setIsbn("12S3T56G");
		kitap2.setPicture("https://marketplace.canva.com/EAFH1JlujwI/2/0/1003w/canva-ye%C5%9Fil-sade-gizemli-orman-foto%C4%9Frafl%C4%B1-roman-kitap-kapa%C4%9F%C4%B1-mfPVe9UxMO0.jpg");
		kitap2.setDescription("Victor Hugo'nun 1862 tarihli başyapıtı Sefiller, ailesine ekmek götürebilmek için hırsızlık yapan ve bu yüzden kürek mahkûmiyetine çarptırılan bir adamın hikâyesi. Aldığı ağır cezanın bedelini ömrü boyunca ödeyen Jean Valjean'ı merkezine alan roman, yoksulluğu, toplumsal adaleti ve dayanışmayı anlatıyor.");

		

		Book kitap3 = new Book();
		kitap3.setTitle("Üçüncü Adam");
		kitap3.setIsbn("12S3T56G");
		kitap3.setPicture("https://upload.wikimedia.org/wikipedia/tr/4/46/%C3%9C%C3%A7%C3%BCnc%C3%BC_Adam_%28Varl%C4%B1k_yay%29_kitap_kapak.jpg");
		kitap3.setDescription("Victor Hugo'nun 1862 tarihli başyapıtı Sefiller, ailesine ekmek götürebilmek için hırsızlık yapan ve bu yüzden kürek mahkûmiyetine çarptırılan bir adamın hikâyesi. Aldığı ağır cezanın bedelini ömrü boyunca ödeyen Jean Valjean'ı merkezine alan roman, yoksulluğu, toplumsal adaleti ve dayanışmayı anlatıyor.");

		
		Book kitap4 = new Book();
		kitap4.setTitle("Hiç varolmamış bir evden ayrılmak");
		kitap4.setIsbn("12S3T56G");
		kitap4.setPicture("https://marketplace.canva.com/EAD37D84Rik/1/0/1003w/canva-bej-a%C4%9Fa%C3%A7-bilim-kurgu-kitap-kapa%C4%9F%C4%B1-XL7t2to0t_I.jpg");
		kitap4.setDescription("Victor Hugo'nun 1862 tarihli başyapıtı Sefiller, ailesine ekmek götürebilmek için hırsızlık yapan ve bu yüzden kürek mahkûmiyetine çarptırılan bir adamın hikâyesi. Aldığı ağır cezanın bedelini ömrü boyunca ödeyen Jean Valjean'ı merkezine alan roman, yoksulluğu, toplumsal adaleti ve dayanışmayı anlatıyor.");

		
		
		
		Publisher publisher = new Publisher();
		publisher.setPublisherName("İş Bankası Yayınları");
		publisher.setAddress("Ankara");
		publisher.setCity("Ankara");
		
		Author mehmetSaved = authorRepository.save(mehmet);
		Book kitap1Saved = bookRepository.save(kitap1);
		Publisher publisherSaved = publisherRepository.save(publisher);
		bookRepository.save(kitap2);
		bookRepository.save(kitap3);
		bookRepository.save(kitap4);
		
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
		
		
		
		
		
		Employee e1 = new Employee();
		e1.setName("Ahmet");
		e1.setStatus("Personel");
		
		Employee e2 = new Employee();
		e2.setName("Veli");
		e2.setStatus("Müdür");
		
		
		employeeDao.save(e1);
		employeeDao.save(e2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
