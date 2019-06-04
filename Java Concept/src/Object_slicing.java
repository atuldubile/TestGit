class sample
{
     void getdata() 
     {
    	 System.out.println("You are in Get Data");
     }	
     
     void putdata() 
     {
    	 System.out.println("You are in PutData");
     }

}

public class Object_slicing extends sample{
	
	void main_getdata() 
	{
		System.out.println("You are in main Getdata");
	}
	
	void main_putdata() 
	{
		System.out.println("You are in main putdata");
	}
	
	public static void main(String[] args)
	{
	    sample s = new Object_slicing();
	    s.getdata();
	    s.putdata();
	    
	    
	    
	    
	    Object_slicing o = new Object_slicing();
	    o.getdata();
	    o.putdata();
	    o.main_getdata();
	    o.main_putdata();		
	}

}
