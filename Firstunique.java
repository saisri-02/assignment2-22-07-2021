import java.util.*;
public class Firstunique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
String str=sc.next();
char ch[]=str.toCharArray();
firstuniq(str,ch);
}
public static void firstuniq(String str,char[] ch )
{
Stack<Character> st=new Stack<>();
for(int i=0;i<st.size();i++)
{
if(ch[i]!=ch[i+1])
{
st.push(ch[i]);
}
else
{
st.remove(i);
}
System.out.println(st);
}
}
}

output:

Enter the String: 
loveleetcode
[2]