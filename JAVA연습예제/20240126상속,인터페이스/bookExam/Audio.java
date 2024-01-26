package interfaceExam.bookExam;

// 			  자식클래스 	implements 	부모인터페이스
public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}// end of turnOn()

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}// end of turnOff()

	@Override
	public void setVolume(int volume) {
//		 				상수 => 클래스명.필드명
		if (volume > RemoteControl.MAX_VOLUME) {
//			최댓값 보다 크면 최댓값으로 구현
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLIME) {
			this.volume = RemoteControl.MIN_VOLIME;
		} else {
			this.volume = volume;
		} // end of if
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}// end of setVolume()

}// end of class
