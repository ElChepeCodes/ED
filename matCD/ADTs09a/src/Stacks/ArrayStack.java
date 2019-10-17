/**
 *  Represents an array implementation of a stack.
 */

package Stacks;

import LinkedStructures.LinkedStruct;

public class ArrayStack<T> implements StackADT<T> {
    // Constant to represent the default capacity of the array.
    private final int DEFAULT_CAPACITY = 100;

    // top represents both the number of elements and the next
    // available position in the array.
    private int top;

    // Array of generic elements to represent the stack.
    private LinkedStruct<T> stack;

    // Creates an empty liked structure using the default capacity.
    public ArrayStack() {
        top = 0;
        stack = new LinkedStruct();
    }

    // Pushes in or adds the specified element to the top of this stack, expanding
    // the capacity of the stack array if necessary.
    public void push (T element) {
        if (stack.isEmpty())
        stack.add(element, 1);
        else
            stack.add(element, stack.size());
    }

    
    
    // Pops out or removes the element at the top of this stack and returns a
    // reference to it. Throws an EmptyCollectionException if the stack
    // is empty.
    public T pop() throws ElementNotFoundException {
        T result;    
        if (isEmpty())
            throw new ElementNotFoundException("ArrayStack(pop)");
        result = stack.get(1);
        stack.remove(1);
        return result;
    }

    // Peeks and returns a reference to the T element at the top of this stack.
    // The element is not removed from the stack.  Throws an
    // EmptyCollectionException if the stack is empty.
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayStack(peek)");

        return stack.get(1);
    }

    // isEmpty: returns true if this stack is empty and false otherwise.
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // size: returns the count (top) of elements in the stack.
    public int size() {
        return stack.size();
    }

    // Returns a string representation of this stack.
    @Override
    public String toString() {
        String result = "";
        if( isEmpty() ) {
            result = "ArrayStack(toString) is EMPTY";
            // Could be thrown an EmptyCollectionException
        } else {
            result = "{BASE, ";
            result+=stack.toString();
            result = result + "TOP}";
        }
        
        return result;
    }

}
