package session16.me;
import java.util.Scanner;

public class Processor {
    private String text;

    public String getText() {
        return text;
    }

    public Processor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void showtoken () {
        String[] arry = text.split(" ");
        for (int i = 0; i < arry.length; i++){
            System.out.println(i+"->"+arry[i]);

            }


    }
public void searchtoken()
{
    Scanner in=new Scanner(System.in);
 String str=in.next();

    //System.out.println(text.contains(str));

    boolean flag=false;
    String[] arry = text.split(" ");
    for (int i = 0; i < arry.length; i++){
        if(arry[i].equals(str));
        {
         flag=true;
        }

    }
if(!flag)
{
    System.out.println("not found");
}
else
    System.out.println("found");

}



public void reverse()
{
    String str="";
    String[] arry = text.split(" ");
    for (int i = arry.length-1; i >= 0; i--) {
        str+=arry[i]+" ";

    }
    System.out.println(str);

}

public void reversetext() {
    String str = "";
    String[] arry = text.split("");
    for (int i = arry.length - 1; i >= 0; i--) {
        str += arry[i] ;

    }
    System.out.println(str);
}
}


