package com.example.demo;

public interface LinkedQuestionAnswer {
	
	///�r ju som att man inte kan k�ra n�got?=?? 
	
	//Question one answer.
	public insert(String question, String answer){}
	//Question multiple answers.
	public insert(String question, String answer, String optionOne,String optionTwo,String optionThree){}
	//Remove question.
	public remove(int id){}
	
	//Return selected node containing question and answer(s). 
	public Node select(){}
	
	
	//etc
	
}
