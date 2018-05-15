package com.fac.depen;

import org.springframework.stereotype.Component;

@Component
public class KeyBoard {
	char alphabet;

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
}
