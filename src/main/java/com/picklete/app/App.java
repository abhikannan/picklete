package com.picklete.app;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.picklete.bean.Bean;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
       
       Bean obj = (Bean) context.getBean("helloBean");
		obj.printHello();
    }
}
