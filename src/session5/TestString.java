package session5;

//5
public class TestString {

    public static void main(String[] args){
        String str="java";  //String str=new String("java");
        String str2="java2";

        // char charAt(int i)
        char c=str.charAt(1);
       // System.out.println(c);
        System.out.printf("%c\n",c);
        //boolean equals(String anotherString)
        if(str.equals(str2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        //String concat(String anotherString)
        String newStr=str.concat(" Programming");
        newStr=str+" programming";
        newStr="programming ".concat(str);
        System.out.println(newStr);

        // boolean startsWith(String str)    prefix
        if(str.startsWith("ja"))
            System.out.println("Yes");
        // boolean endsWith(String str)   suffix
        if(str.endsWith("va"))
            System.out.println("Yes");
        //int indexOf(char ch)    int indexOf(char ch, int fromIndex)
        System.out.println(str.indexOf('j'));
        System.out.println(str.indexOf('a',0));
        //int indexOf(String str)    int indexOf(String str, int fromIndex)
        System.out.println(str.indexOf("jaa"));
        //int length()
        System.out.println(str.length());
        //String replace(char oldChar,char newchar)
        //String replaceFirst(String str1,String str2)
        //String replaceAll(String str1,String str2)
        str="java java";
        newStr=str.replace('j', 'k');
        System.out.println(newStr);
        //String subString(int beginIndex)
        //String subString(int beginIndex,int endIndex)
        System.out.println(str.substring(2));
        newStr=str.substring(2).replace('j', 'k');
        System.out.println(newStr);//me
        //String toLowerCase()  String toUpperCase()
        System.out.println(str.toUpperCase());
        // char[] toCharArray()
        char []array=str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%c\n",array[i]);
        }
        //String trim()     //strip()
        str="  java    ";
        newStr=str.trim();
        System.out.println(newStr);
        //static String valueOf(int i)
        //static String valueOf(float f)
        //static String valueOf(char c)   'a'-> "a"
        //static String valueOf(char[] array)
        //...
        newStr=String.valueOf(123);  //"123"
        newStr=String.valueOf('b'); //"12.5"
        System.out.println(newStr);
        //static String format("template",....)
        newStr=String.format("%25s %10d\n",str,123);
        System.out.println(newStr);
        //String [] split(...)

    }
    //str="java java"  ch='a'


}
