package t4;


public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
		peopleTalk.talk("业务方法");
//		peopleTalk.spreak("业务方法");
	}

}
