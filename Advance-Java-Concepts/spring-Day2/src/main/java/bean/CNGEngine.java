package bean;

import org.springframework.stereotype.Component;

@Component
public class CNGEngine implements IEngine{
	
	@Override
	public String getBHP() {
		return "110 BHP";
	}

}
