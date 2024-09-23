
public class Pallindrome 
{
    public static void main(String[] args)
    {
        String s1="MADAM";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s2.equals(s1))
        {
            System.out.println("Given String is a Palindrome");
        }
        else
        {
            System.out.println("Given String is not an Palindrome");
        }
    }
}
