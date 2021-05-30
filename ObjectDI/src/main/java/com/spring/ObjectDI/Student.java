package com.spring.ObjectDI;

public class Student {
	
	//Tight coupling
	//MathCheat mathcheat = new MathCheat();
	
	MathCheat mathcheat;
	
	public MathCheat getMathcheat() {
		return mathcheat;
	}

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	
	public void cheating()
	{
		mathcheat.mathCheat();
	}

}
