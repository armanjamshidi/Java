package session8;

public class Test {
    public static void main(String[]args) {
        Message message = new Message();
        message.ShowMessageCode(132);
        message.showCodeMessage(123);
        message.showCodeMessage(12.3);
        message.showCodeMessage("sc528");

        User user = new User("258");
        System.out.println(user.getID());

        user.setUserinfo("ali amini", 'm');
        System.out.println(user.toString());
        User user2 = new User("369");
        user2.setUserinfo("mina mohamadi");
        System.out.println(user2.toString());
    }
    }
