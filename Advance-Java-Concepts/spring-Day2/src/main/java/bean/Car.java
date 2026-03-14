package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Service
//@Repository
public class Car {
	@Value("${carname}")
	private String name;
//	@Autowired
//	@Qualifier("cng")
	private IEngine engine;
//	@Autowired
//	@Qualifier("jk")
	private ITyre tyre;

	public Car() {
		super();
	}
	
	@Autowired
	public Car(@Qualifier("petrolEngine") IEngine engine,	@Qualifier("mrfTyre") ITyre tyre) {
		super();
		this.engine = engine;
		this.tyre = tyre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public ITyre getTyre() {
		return tyre;
	}

	public void setTyre(ITyre tyre) {
		this.tyre = tyre;
	}

	public void printCar() {
		System.out.println("Car Name: " + this.name);
		System.out.println("BHP: " + this.engine.getBHP());
		System.out.println("Tyre Details: " + this.tyre.getTyreDetails());
	}

}
