package session16.javaclass;

public class Processor {
    private String text;
    private int number ;
//    private String[] textArray;

    public Processor(String text , int number) {
        this.text = text;
        this.number = number;
//        this.textArray = getTextArray(text);
    }

    private  String[] getTextArray(String text) {
        return text.split(" ");
    }

    public void showTokens(){
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            System.out.println(i + "=> " + textArray[i]);
        }
    }


    public void findToken(String newToken){
        if(text.contains(newToken)){
            System.out.println("token exist");
        }else{
            System.out.println("not found");
        }
    }

    public void reverseToken(){
        String[] textArray = text.split(" ");
        String str = "";
        for (int i = 0; i < textArray.length; i++) {
            str += textArray[textArray.length-1-i]+" ";
        }
        System.out.println("reverseText: "+str);
    }

    public void revereseText(){
        String[] textArray = text.split("");
        char[] chars = text.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += chars[chars.length-1-i];
        }
        System.out.println("revereseText: "+ str);
    }



    public void sumOfDigits(){
        int sum = 0;
        char[] digits = String.valueOf(number).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(String.valueOf(digits[i]));
        }
        System.out.println(sum);

    }





}
