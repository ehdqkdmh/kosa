package kr.or.kosa.hello.dao;

public class HelloRepository implements IHelloRepository {

	@Override
	public String sayHello(String message) {
		// TODO Auto-generated method stub
		System.out.println("데이터베이스와 통신");
		return ">>>"+message+"<<<";
	}

}
