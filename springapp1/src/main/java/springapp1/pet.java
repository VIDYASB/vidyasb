package springapp1;

public class pet {
private String name;
private Animal animal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Animal getAnimal() {
	return animal;
}
public void setAnimal(Animal animal) {
	this.animal = animal;
}

public void doSomething(){
	animal.eat();
	animal.makesound();
}

}
