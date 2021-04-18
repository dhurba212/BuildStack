package dev.ghimire;

import dev.ghimire.exception.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTests {

    Stack stack;

    @BeforeEach
    void setUp(){
         stack = new Stack();
    }

    //name of the test returns when
    //test that isEmpty returns true when stack is empty
    @Test
    public void isEmpty_returnsTrue_whenStackIsEmpty(){
        Boolean bool = stack.isEmpty();
        Assertions.assertEquals(true,bool);
    }
    //test that isEmpty returns false when stack is not empty
    @Test
    public void isEmpty_returnsFalse_whenStackIsNotEmpty(){
        stack.push(5);
        Boolean bool = stack.isEmpty();
        Assertions.assertEquals(false,bool);
    }
    //test that push data to the stack and returns the pushed data
    @Test
    public  void isEmpty_returnsFalse_whenObjectIsPushed(){
        Object value=5;
        stack.push(value);
        Assertions.assertEquals(false,stack.isEmpty());
    }
    //test that pop throws exception when stack is null
    @Test
    public void pop_throwsException_whenStackIsEmpty(){
        Assertions.assertThrows(NotFoundException.class,()->stack.pop());
    }
    //test that pop returns object in stack when object exists in stack
    @Test
    public void pop_returnsObject_whenObjectExistsInStack()throws NotFoundException{
        stack.push(5);
         Object obj = stack.pop();
        Assertions.assertEquals(5,obj);
    }
    //Test that contains return false when object doesnt exist in stack
    @Test
    public void contains_returnsFalse_whenObjectDoesntExist(){
        stack.push(7);
        Boolean bool = stack.contains(5);
        Assertions.assertEquals(false,bool);
    }
    //contains returns true when stack contains the object
    @Test
    public void contains_returnsTrue_whenObjectIsPresentInStack(){
        stack.push(5);
        Assertions.assertEquals(true,stack.contains(5));
    }
    //test contains that returns true when object is in the middle of stack
    @Test
    public void contains_returnsTrue_whenValueIsContainedInMiddle(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(true,stack.contains(2));
    }
    //test peek returns the head node
    @Test
    public void peek_returnsHeadNode(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3,stack.peek());
    }
    //test size return size when stack has nodes in it
    @Test
    public void size_returnsLengthOfStack(){
        stack.push(1);
        Assertions.assertEquals(1,stack.size());
        stack.push(2);
        Assertions.assertEquals(2,stack.size());
    }

}
