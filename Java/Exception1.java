import java.util.*;
import java.io.*;
class ThrowDemo extends Exception{
    ThrowDemo(String s)
    {
        super(s);
    }
}
    class UserDefinedException{
        public static void main(String args[]){
            try{
                int a=10/0;
                throw new UserDefinedException("Error");
            }
            catch(ThrowDemo t){
                System.out.println(t.getMessage());
            }
        }
    }
