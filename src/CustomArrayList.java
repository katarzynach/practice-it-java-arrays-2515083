import java.util.Arrays;

public class CustomArrayList<D> {
  
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 2;
  private Object elements[];

  public CustomArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public D get(int i) {

    if(i >= size || i < 0) {
      throw new IndexOutOfBoundsException("Index out of bounds. Array size: " + size + " Given index " + i);
    }
    return (D) elements[i];
  }

  public void add(D item) {
    if(size == elements.length){
      int increasedSize = size * 2;
      elements = Arrays.copyOf(elements, increasedSize);
    }
    elements[size] = item;
    size++;

  }

  public int size() {
      return size;
  }

}