package Example;

public class MailService implements MessageService {
	private String message;
	private String tomail;
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTomail() {
		return tomail;
	}
	public void setTomail(String tomail) {
		this.tomail = tomail;
	}
	public MailService() {
		this.message="Have a nice day";
		this.tomail="dhanish123@";
		
	}
	public void sendMessage() {
		System.out.println("Message"+message+"has been send to"+tomail);
	}

}
