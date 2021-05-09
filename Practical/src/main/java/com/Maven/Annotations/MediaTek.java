package com.Maven.Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileProcessor {

	public void Process() {
		System.out.println("2nd Best World's Processor");
	}

}
