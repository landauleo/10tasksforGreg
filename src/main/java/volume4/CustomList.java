package volume4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class CustomList implements List {

    public Integer[] numbers;

    public int currentIndex;

    public int lastIndex;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty(numbers);
    }

    public boolean isEmpty(Integer[] numbers) {
        return numbers.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Integer number : numbers) {
            if (number.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return numbers[currentIndex]< numbers[lastIndex];
            }

            @Override
            public Object next() {
                if (this.hasNext()) {
                    return new Object[currentIndex++];
                }
                throw new NoSuchElementException();
            }
        }
                ;
    }

    @Override
    public Object[] toArray() {
        Integer[] arr = new Integer[numbers.length];
        currentIndex = 0;
        for (Integer number : numbers) {
            arr[currentIndex] = number;
            currentIndex++;
        }
        return arr;
    }

    @Override
    public boolean add(Object o) {
//        if(currentIndex == lastIndex) {
//            Integer[] numbers;
//
//        }
//        numbers[currentIndex] = (Integer) o;
//        return numbers[currentIndex];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

}
