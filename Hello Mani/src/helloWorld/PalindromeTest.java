package helloWorld;

public class PalindromeTest
{
	//abcddc
 public String palindrome(String s)
 {
  //Input{a,b,c,d,d,c]
  char[] input = s.toCharArray();

  int start = 0; 
  int end = input.length - 1; //end = 6-1 = 5

  //ispalindrome(Input{a,b,c,d,d,c], 0, 5)
  if (isPalindrome(input, start, end))
   return "";
  //false
  else
  {
   //start = 1;
   start++;
   //while(1<5)
   //while(2<5)
   while (start < end)
   {
	//if (abcddc,1, 5)
	//if (abcddc,2, 5)
    if (isPalindrome(input, start, end))
    //if is false go out
    	//true
    {
     break;
     //If(2, 5) - true, so break
    }
    start++;
    //start = 2
   }
   //toreturn =  {0,0,0}
   char[] toReturn = new char[start];
   for (int i = 0; i < toReturn.length; i++)
   {
    toReturn[i] = input[--start];
    //b,
    //a
    //start--;
   }
   return new String(toReturn);

  }

 }
//ispalindrome(Input{a,b,c,d,d,c], 0, 5)
//ispalindrome(Input{a,b,c,d,d,c], 2, 5)
 public boolean isPalindrome(char[] input, int start, int end)
 {
  boolean isPalindrome = true;
  //while (0<5)
  //while (2<5)
  //while (4<3)
    while (start < end)
  {
   //if(a != c)
   //if(c != c)
   //if(d != d)
   if (input[start] != input[end])
   {
    isPalindrome = false;
    break;
   }
   start++;
   //start = 3
   //start = 4
   end--;
   //end = 4
   //end = 3
  }
    
  return isPalindrome;

 }
 
 public static void main(String[] args)
 {
  
  PalindromeTest test = new PalindromeTest();
  System.out.println(test.palindrome("abcddc"));
  System.out.println(test.palindrome("aaab"));
  System.out.println(test.palindrome("abb"));
  System.out.println(test.palindrome("abc"));
  System.out.println(test.palindrome("abcde"));
  System.out.println(test.palindrome("abcaba"));
  System.out.println(test.palindrome("system"));
  
  
  
 }

}