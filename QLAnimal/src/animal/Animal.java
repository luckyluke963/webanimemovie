package animal;

public abstract class Animal {
String name;
String image;
 public Animal(){}
 
public Animal(String name, String image) {
	super();
	this.name = name;
	this.image = image;
}

public String getName() {
	return name;
}

public String getImage() {
	return image;
}

/*public String sayHello(){
	return "Hello";
} */
public abstract String sayHello();
 
}
