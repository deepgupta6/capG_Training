package bean;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine{
	
	@Override
	public String getBHP() {
		return "150 BHP";
	}

}
