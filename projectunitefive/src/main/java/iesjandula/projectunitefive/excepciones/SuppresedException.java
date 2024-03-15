package iesjandula.projectunitefive.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SuppresedException {
	
	
	
	public static void demoSuppressedException(String filePath) throws IOException   {
	    FileInputStream fileIn = null;
	    FileNotFoundException ex=null;
	    
	    try {
	        fileIn = new FileInputStream(filePath);
	    } catch (FileNotFoundException e) {
	            System.out.println("Error");
	            ex= e;
	            
	            
	    } finally {
	  
	    		try {
					fileIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					if (ex!=null) {
												
						e.addSuppressed(ex);
						throw new IOException( "Error tambien al cerrar el fichero", e);
					}
				}
	    }
	}

public static void demoAddSuppressedException(String filePath) throws IOException {
	    Throwable firstException = null;
	    FileInputStream fileIn = null;
	    try {
	        fileIn = new FileInputStream(filePath);
	    } catch (IOException e) {
	        firstException = e;
	    } finally {
	        try {
	            fileIn.close();
	        } catch (NullPointerException npe) {
	            if (firstException != null) {
	                npe.addSuppressed(firstException);
	            }
	            throw npe;
	        }
	    }
	}


	
}

