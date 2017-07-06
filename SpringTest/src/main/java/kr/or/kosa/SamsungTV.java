package kr.or.kosa;

public class SamsungTV implements TV{

		private Speaker speaker;
		private int price;
		
		public SamsungTV() {
			System.out.println("===> SamsungTV 객체 생성됨");;
		}
		
		

		public void setSpeaker(Speaker speaker) {
			System.out.println("===>setSpeaker() 호출");
			this.speaker = speaker;
		}



		public void setPrice(int price) {
			System.out.println("===>setPrice() 호출");
			this.price = price;
		}



		@Override
		public void powerOn() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void powerOff() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void volumeUp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void volumeDown() {
			// TODO Auto-generated method stub
			
		}
		



}




