package problem02;

public class MyService extends BaseService {
	private String message = "서비스시작";
	private static int checkCnt = 0;
	
	@Override
	public String day() {
		String day = super.day();
		return day.concat(message);
	}

	@Override
	public String night() {
		String night = super.night(); // 무조건 밤이 들어옴
		String finalMessage;
		
		if (night.equals("밤") && checkCnt == 0) {
			finalMessage = afternoon();
		} else {
			finalMessage = night.concat(message);
		}
		checkCnt++;
		return finalMessage;
	}
	
	public String afternoon() {
		String afternoon = "오후";
		return afternoon.concat(message);
	}
}
