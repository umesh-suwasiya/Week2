class Palindrome{
  public static void checkString(String s){
    int i,j;
    char[] original = s.toCharArray();
    int length = original.length;
    char[] reverse = new char[length];
    for(i=length-1,j=0;i>=0;i--,j++)
    {
      reverse[j] = original[i];
    }
    String rev = new String(reverse);
    if(s.equals(rev))
    {
      System.out.println("String is palindrome");
    }
    else
    {
      System.out.println("Not an palindrome");
    }
  }
  public static void main(String[] args){
    Palindrome p = new Palindrome();
    p.checkString(args[0]);
  }
}
