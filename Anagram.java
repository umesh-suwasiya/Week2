class Anagram
{
  public static void checkString(String a, String b)
  {
    int sum1 = 0;
    int sum2 = 0;
    a = a.toLowerCase();
    b = b.toLowerCase();
    char[] str1 = a.toCharArray();
    char[] str2 = b.toCharArray();
    if(str1.length==str2.length)
    {
      for(int i=0;i<str1.length;i++)
      {
        sum1 = sum1 + str1[i];
        sum2 = sum2 + str2[i];
      }
    }
    else
    {
      System.out.println("Strings are not anagram");
    }
    if(sum1==sum2)
    {
      System.out.println("Strings are anagram");
    }
    else
    {
      System.out.println("Strings are not an anagram");
    }
  }
  public static void main(String[] args)
  {
   Anagram a = new Anagram();
   a.checkString(args[0],args[1]);
  }
 }
