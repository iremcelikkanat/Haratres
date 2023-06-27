package haratres;

public class MergeString {

	public void exceptionControl(String a,String b) 
	{
		   if (a.length() <= 1 || a.length() >= 2500 || b.length() <= 1 || b.length() >= 2500) 
		   {
		        throw new IllegalArgumentException("Geçersiz Array uzunluðu.");
		   }
		
	}

		public void MergeString(String a,String b)
		{		
				StringBuilder sBuilder = new StringBuilder();
				int lenght;		
		       
		       if(a.length()>b.length())
		        {
		    	   lenght=b.length();
		        }
		       else if(a.length()<b.length()) {
		    	   lenght=a.length();
		       }
		       else {
		    	   lenght=a.length();
		       }
		        
		        for (int i = 0; i < lenght; i++) {
		        	sBuilder.append(a.charAt(i));
		        	sBuilder.append(b.charAt(i));
		        }
		        
		        if (a.length() > b.length()) {
		        	sBuilder.append(a.substring(lenght));
		        } else if (b.length() > a.length()) {
		        	sBuilder.append(b.substring(lenght));
		        }
		
		        printMergeString(sBuilder);
	        
	  }
		public void printMergeString(StringBuilder sBuilder)
		{
            System.out.println(sBuilder); 

		}
	
	}


