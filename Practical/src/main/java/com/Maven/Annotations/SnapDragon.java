package com.Maven.Annotations;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void Process() {
		System.out.println("World's Best CPU");
	}

}
