package company;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Mammal{
	public void bark() {
		System.out.println("dog is barking");
	}

}
