package com.nesan.LibraryManagement4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	BookService bs=(BookService) context.getBean("service");
    	System.out.println(bs);
        System.out.println( "Hello World!" );
    }
}
