package Example;

public class TestMessageService {
	
	public static void main(String args[]) {
		MessageService ms=new MailService();
		MessageService me=new SMSservice();
		
		DemoApplication da=new DemoApplication(ms);
		da.Demo();
	}

}

