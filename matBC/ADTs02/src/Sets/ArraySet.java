/**  
 * ArraySet represents an array implementation of a set.
 */

package Sets;
import java.util.*;

public class ArraySet<T> implements SetADT<T> {
  private static Random rand = new Random();
  private final int DEFAULT_CAPACITY = 100;
  private final int NOT_FOUND = -1;
  private int count;  // the current number of elements in the set
  private T[] contSet; 
  
  /**
   * Creates an empty set using the default capacity.
   */
  public ArraySet() {
    count = 0;
    contSet = (T[])(new Object[DEFAULT_CAPACITY]);
  }
  
  /**
   * Creates an empty set using the specified capacity.
   */
  public ArraySet(int initialCapacity) {
    count = 0;
    contSet = (T[])(new Object[initialCapacity]);
  }
  
  /**
   * Adds the specified element to the set if it is not already
   * present. Expands the capacity of the set array if necessary.
   */
  public void add(T element) {
    
    if (!contains(element)) {       //Verifica que no esté el elemento.
      if (count == contSet.length)
        expandCapacity();           //Si el arreglo está lleno, lo aumenta.
      
      //Agrega el elemento.
      contSet[count]= element;
      count++;
    }
  }
  
  /**
   * Adds the contents of otherSet to this set.
   */
  public void addAll(SetADT<T> oSet) {
    Iterator<T> iter= oSet.iterator();
    T element;
    
    while (iter.hasNext()) {
      element = iter.next();
      this.add(element);
    }
  }
  
  /**
   * Removes a random element from the set and returns it. Throws
   * an EmptyCollectionException if the set is empty.
   */
  public T removeRandom() throws EmptyCollectionException {
    T result = null;
    int index;
    
    if (isEmpty())
      throw new EmptyCollectionException("ArraySet");

    // Generates a random integer between [0,count-1].
    index = rand.nextInt(count);

    // Recovers the selected element.
    result= contSet[index];
    
    // Moves the last element to the place of the removed element.
    contSet[index]= contSet[count-1];
    contSet[count-1]= null;
    count--;
    
    return result;
  }
  
  /**
   * Removes the specified element from the set and returns it.
   * Throws an EmptyCollectionException if the set is empty and a
   * ElementNotFoundException if the element is not in the set.
   */
  public T remove (T element) throws EmptyCollectionException,
                                      ElementNotFoundException {
    boolean found = false;   // Not found
    int index;
    
    if (isEmpty())
      throw new EmptyCollectionException("ArraySet");
    
    // Look for the elemente inside this set.
    index = 0;
    while (index<count && !found) {
      found = contSet[index].equals(element);
      index++;      
    }
    
    // Was it found
    if (!found)
      throw new ElementNotFoundException("ArraySet");   //No.
    
    //If it was found, recovers the element and erases from this set.
    T result= contSet[index-1];
    contSet[index-1]= contSet[count-1];
    contSet[count-1]= null;
    count--;
    
    return result;
  }
  
  /**
   * Returns a new set that is the union of this set and
   * otherSet.
   */
  public SetADT<T> union (SetADT<T> oSet) {
    ArraySet<T> result= new ArraySet<T>();
    
    result.addAll(this);
    result.addAll(oSet);
    
    return result;
  }

  /** Returns the intersection of this set and the otherSet.
    */
  public SetADT<T> intersection(SetADT<T> oSet) {
    ArraySet<T> result= new ArraySet<T>();
    T el;
    Iterator<T> iter1= this.iterator();
    while (iter1.hasNext()){
        el=iter1.next();
        if (oSet.contains(el)){            
            result.add(el);
        }//if
           
    }//while
    return result;
  }
  
  /** Returns the difference of this set and the otherSet.
    */
  public SetADT<T> difference(SetADT<T> oSet) {
    ArraySet<T> result= new ArraySet<T>();
    T el;
    Iterator<T> iter= this.iterator();
    while (iter.hasNext()){
        el=iter.next();
        if (!oSet.contains(el)){
            result.add(el);
        }//if
           
    }//while
    
    return result;    
  }
 
  /**
   * Returns true if this set contains the specified element.
   */
  public boolean contains (T element) {
    boolean found = false;  //Not found
    int index;
    
    index = 0;
    while (index<count && !found) {
      found = contSet[index].equals(element);
      index++;
    }
    
    return found;
  }
  
  /**
   * Returns true if this set contains exactly the same elements
   * as the otherSet.
   */
  public boolean equals (SetADT<T> oSet) {
    int sizeDifThisoSet, sizeDifoSetThis;
    boolean identical = true;
    
    //TO-DO
    
    return identical;  
  }
  
  /**
   * Returns true if this set is empty and false otherwise.
   */
  public boolean isEmpty() {
    return (count == 0);
  }
  
  /**
   * Returns the number of elements currently in this set.
   */
  public int size() {
    return count;
  }
  
  /**
   * Returns an iterator for the elements currently in this set.
   */
  public Iterator<T> iterator() {
    return new ArrayIterator<T>(contSet,count);
  }
  
  /**
   * Returns a string representation of this set.
   */
  public String toString() {
    String result = "";
    if(isEmpty()) {
        result = "ArraySet is {EMPTY}";
    } else {
        result = "Set{ ";
        for (int index=0; index < count; index++) {
            result = result + "[" +index + "]" +
                    contSet[index].toString() + ", ";
        }
        result = result + "}";
    }
    result = result + "\n";
    return result;
  }
  
  /**
   * Creates a new array to store the contents of the set with
   * twice the capacity of the old one.
   */
  private void expandCapacity() {
    T[] larger = (T[])(new Object[contSet.length*2]);
    
    for (int index = 0; index < contSet.length; index++)
      larger[index] = contSet[index];
    
    contSet = larger;
  }
}

