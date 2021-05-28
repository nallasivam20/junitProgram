package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleProgram {

	    @BeforeClass
	    public static void beforClassMethod()
	    {
	    	System.out.println("befor class");
	    }
	    
//	    @BeforeClass
//	    public static void a()
//	    
//	    {
//	    	System.out.println("dummy");
//	    }
	    
	    @AfterClass
	    public static void afterClassMethod()
	    {
	    	System.out.println("After class method");
	    }
	    
	    @Test
	    public void maaf1()
	    {
	    	System.out.println("First function");
	    }
	   
	    @Test
	    public void zf2()
	    {
	    	System.out.println("Second method");
	    }
	    
	    @Test
	    public void af3()
	    {
	    	System.out.println("f3");
	    }
}
