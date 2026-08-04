//Palindrome number 
public class variableanddatatype {

  public static void main(String[] args) {
    int num = 12787891;
    int firstdigit = num/100;
    int lastdigit = num%10;
    if(firstdigit==lastdigit){
      System.out.println("num is palindrome");
    }
    else{
      System.out.println("num is not plaindrome");
    }
  }
}