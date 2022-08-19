package session6;

//6
public class StringProcessor {

    private String text;

    public StringProcessor(String str) {
        text = str;
    }

    public String getText() {
        return text;
    }

    public void setText(String str) {
        text = str;

    }

    public void reverse() {
        String tempStr = "";
        System.out.println(text.length());
        for (int i = text.length() - 1; i >= 0; i--) //4,n,3,a,2,m,1,r,0,a
        {
            tempStr += text.charAt(i);

        }
        text = tempStr;

    }

    public int freq(char c) {
        return freq(String.valueOf(c));
//        int count = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == c) {
//                count++;
//            }
//        }
//        return count;
    }

    //text=java java     str=java
    //text=jajajajajaja  str=aja
    public int freq(String str) {
        int count = 0;
        int pos = 0;
        while (true) {
            pos = text.indexOf(str, pos);
            System.out.println("index:"+text.indexOf(str,pos));//test
            if (pos != -1) {
                count++;
                pos+=str.length();
                System.out.println("length:"+str.length());//test
                System.out.println("pos:"+pos);//test
            } else
                break;

        }
        return count;
    }
}