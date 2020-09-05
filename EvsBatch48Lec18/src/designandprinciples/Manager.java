package designandprinciples;

import java.util.List;

public class Manager {

	private List<Devloper> developers;
	
	public Manager(List<Devloper> devlopers) {
		this.developers = devlopers;
	}
	
	public void manage() {
		for(Devloper d : developers) {
			d.develop();
		}
	}
}
