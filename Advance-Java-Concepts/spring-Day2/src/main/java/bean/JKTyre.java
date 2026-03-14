package bean;

import org.springframework.stereotype.Component;

@Component
public class JKTyre implements ITyre{
	
	@Override
	public String getTyreDetails() {
		return "JK Tyre";
	}

}
