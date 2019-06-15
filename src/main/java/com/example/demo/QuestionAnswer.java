package com.example.demo;


public class QuestionAnswer implements LinkedQuestionAnswer{
	
	/// Köra med ankare eller pointer ????? 
	
	// Just nu kan man ej ha två frågor som är samma.. 
	
	
	private Node root, pointer;
	private int size;
	
	private class Node{
		private static int id = 0;
		private Node next,prev;
		private String question,answer,optionOne,optionTwo,optionThree;
		
		//Used for single answer questions.
		private Node(String question, String answer){
			this.id = id++;
			this.question = question;
			this.answer = answer;
		}
		
		//Used for multiple answer questions.
		private Node(String question, String answer, String optionOne, 
					 String optionTwo, String optionThree){
			this.id = id++;
			this.question = question;
			this.answer = answer;
			this.optionOne = optionOne;
			this.optionTwo = optionTwo;
			this.optionThree = optionThree;
		}

		//Dummy node used for initiating list.
		private Node(){}

	}
	
	public QuestionAnswer(){
		this.root = this.pointer = new Node();
		this.size = 0;
	}
	
	//New question with one answer.
	public void insert(String quest, String answer){
		Node newNode = new Node(quest, answer);
		if (size < 1){
			root = pointer = newNode;
		}else{
			Node temp = pointer; //
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
		size += 1;
	}
	//New question with multiple answers.
	public void insert(	String quest,String answer, String questionOne, 
						String questionTwo, String questionThree){
		Node newNode = new Node(quest, answer, questionOne, questionTwo, questionThree);
		if(size < 1){
			root = pointer = newNode;
		}else{
			Node temp = pointer;
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
		size += 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
