import java.io.*;
 class CopyFile {

   public static void main(String args[]) {  
     
      try {
        FileInputStream  in = new FileInputStream("input.txt");
	    FileOutputStream out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
     catch(IOException e){
		  System.out.println(e);
	  }
      finally {
         System.out.println("Hello Done");
      }
   }
}
