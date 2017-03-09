package n2p;

/**
 *
 * @author zangsir
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMatch
{
    public boolean checkRex (char input){

      // String to be scanned to find the pattern.
      
      //char l = '大';
      CharSequence line = String.valueOf(input);
      //CharSequence line = ",";
      //String pattern = "(.*)(\\d+)(.*)";
      //String pattern = "[^a-zA-Z0-9\\s]";
      String pattern = "\\p{L}";
      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         //System.out.println("Found value: " + m.group(0) );
         //System.out.println("Found value: " + m.group(1) );
         //System.out.println("checker yes found:" + m.group(0) );
         
         return true;
      } else {
         //System.out.println("checker NO MATCH");
         return false;
      }
   }
    
    //method to check if it is a english alphanumeric character. Chinese characters are not treated as 
    //such in an regex like this "[^a-zA-Z0-9\\s]"
    public boolean checkAlpha (char input){
      CharSequence line = String.valueOf(input);
      //CharSequence line = ",";
      //String pattern = "(.*)(\\d+)(.*)";
      String pattern = "[a-zA-Z0-9\\s]";
      //String pattern = "\\p{L}";
      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         //System.out.println("Found value: " + m.group(0) );
         //System.out.println("Found value: " + m.group(1) );
         //System.out.println("checker yes found english:" + m.group(0) );
         
         return true;
      } else {
         //System.out.println("checker NO MATCH english");
         return false;
      }
    }
    
    
    
}
