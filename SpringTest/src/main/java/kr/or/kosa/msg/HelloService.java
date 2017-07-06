package kr.or.kosa.msg;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "당신의 이름은"+"\t"+name;
	}

}
