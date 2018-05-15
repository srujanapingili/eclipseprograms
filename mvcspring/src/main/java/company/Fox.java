package company;

import org.springframework.stereotype.Component;

@Component
public class Fox implements Mammal{
	public void bark() {
		System.out.println("fox is barking");
	}

}
