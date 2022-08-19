package session6;

//6
public class StringProcessortest {
    public static void main(String args[]){
        String str="java java";
        StringProcessor mySp=new StringProcessor(str);
        mySp.reverse();
        System.out.println("Reverse="+mySp.getText());
        mySp.setText(str);
        System.out.println("Freq char="+mySp.freq('a'));
        System.out.println("Freq String="+mySp.freq("java"));
    }
}
