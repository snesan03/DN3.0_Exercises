package com.nesan.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService bs=(BookService)context.getBean("service");
    	BookRepository br=(BookRepository)context.getBean("repository");
        System.out.println( "Hello World!" );
    }
}
