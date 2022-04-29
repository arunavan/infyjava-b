package com.infosys.funcitonalinterface;

interface Pet {
	// Method definitions describing a pet

	void getPetName();
}

interface ServiceAnimal extends Pet {
	// Method definitions describing service animal
	void doService();
	
}

interface ServicePet extends ServiceAnimal {
	// This will have methods from Pet and Service Animal interfaces along with the
	// methods of its own
	void disp();
}

public class InterfaceInheritanceDemo implements ServicePet {
	InterfaceInheritanceDemo() {
		
	}
	public void getPetName() {
	}

	public void doService() {

	}
	public void disp() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
