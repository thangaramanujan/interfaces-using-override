package Study.programming;

public class Main {

    public static void main(String[] args) {
      ITelephone srisPhone;
      srisPhone = new DeskPhone(123456);
      srisPhone.powerOn();
      srisPhone.callPhone(123456);
      srisPhone.answer();

      srisPhone = new MobilePhone(24565);
      srisPhone.powerOn();
      srisPhone.callPhone(24565);
      srisPhone.answer();
    }
}
