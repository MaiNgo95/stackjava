import java.io.*;
import java.util.*;


class Main {
  static void stack_push(Stack<Integer> stack){
     //make a call for function then get the object and return fucction
     System.out.println("print out stack");
    for (int i = 0; i < 5; i++){
      stack.push(i);   
    }
     System.out.println(stack); //static can not use in object, it directlly print output in its function
  }
  static void stack_pop(Stack<Integer> stack){
    System.out.println("print out stack after popping");
    for(int i =0; i < 5; i++){
      Integer y = (Integer) stack.pop();//assign a variable for pop implement
      System.out.println(y);
    }
  }

  static void stack_peek(Stack<Integer> stack){
      Integer x = (Integer) stack.peek(); 
      System.out.println(x);
  }
   
  
  public static void main(String[] args) {
    Stack< Integer> stack = new Stack<Integer>();//object for stack function
    stack_push(stack);
    stack_pop(stack);
    stack_peek(stack);
    
    
  }
}