package Example;

public class DemoApplication {
//	private MessageService ms=new SMSservice();
//	
//	public void sendmsg() {
//		ms.sendMessage();
//	}
	
	private MessageService msg;
	
	public DemoApplication(MessageService msg) {
		this.msg=msg;
	}
	public void Demo() {
		msg.sendMessage();
	}

}
