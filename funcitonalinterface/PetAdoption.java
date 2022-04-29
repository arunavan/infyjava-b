package com.infosys.funcitonalinterface;
interface Pet{
	
}
class Cat implements Pet{
    String breed;
}
class Dog  implements Pet{
    String furColour;
}
class PetAdoption {
	public void adoptPet(Pet p){
        System.out.println("Pet adopted ...");
    }
	
    
    public static void main(String[] args) {
    	PetAdoption p=new PetAdoption();
    	Pet pet=new Cat();
    	p.adoptPet(pet);
    	pet=new Dog();
    	p.adoptPet(pet);
	}
}