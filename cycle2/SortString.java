public class SortString{
public static void main(String[] args)
{
System.out.println("TESMOL SHAJI\n56\n26-02-2024\nQ6:Program to Sort strings");
String names[]={"st","joseph","college","of","engineering"};
String temp;
int n=names.length;
int i;
int j;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("the sorted array of string is:");
for(i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}
