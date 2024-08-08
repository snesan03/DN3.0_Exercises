package com.nesan.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.aspect.LoggingAspect;
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
        System.out.println( bs);
        bs.addBook();
        bs.deleteBook();
        LoggingAspect.test();
        ((AbstractApplicationContext) context).close();
    }
}
