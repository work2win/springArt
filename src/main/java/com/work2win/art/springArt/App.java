package com.work2win.art.springArt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.work2win.art.springArt.Model.ArtType;

/**
 * App displays the bean property values
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringArt.xml");
    	ArtType artType = (ArtType)context.getBean("arttype");
    	System.out.println( artType );
    }
}
