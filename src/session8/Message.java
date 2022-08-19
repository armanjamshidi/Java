package session8;

public class Message {
    public void ShowMessageCode(int code)
    {
        System.out.printf("your message code is %08d %n",code);

    }
    public void showCodeMessage(double code)
    {
        System.out.printf("your message code is %.2f %n",code);

    }
    public void showCodeMessage(String  code)
        {System.out.printf("your message code is %-10s .%n",code);
        }
}
