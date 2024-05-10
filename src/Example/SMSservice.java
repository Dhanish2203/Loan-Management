package Example;

public class SMSservice implements MessageService {
	private String message;
	private Integer tomobile;
	
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getTomobile() {
		return tomobile;
	}
	public void setTomobile(Integer tomobile) {
		this.tomobile = tomobile;
	}
	public SMSservice() {
		this.message="good day";
		this.tomobile=1234567890;
	}
	public void sendMessage() {
		System.out.println("Message"+message+"Has been send to"+tomobile);
	}

}
