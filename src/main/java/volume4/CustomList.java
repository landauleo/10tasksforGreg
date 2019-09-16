package volume4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.lang.ArrayUtils;


public class CustomList implements List {

    private Object[] objects;

    private int currentIndex;

    private int lastIndex;

    private Object[] newObj;

    @Override
    public int size() {
        return ArrayUtils.getLength(objects);
    }

    @Override
    public boolean isEmpty() {
        return objects.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object.equals(o)) {
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
                return currentIndex < lastIndex;
            }

            @Override
            public Object next() {
                return objects[currentIndex++];
            }
        }
                ;
    }

    @Override
    public Object[] toArray() {
        newObj = new Object[objects.length];
        currentIndex = 0;
        for (Object object : objects) {
            newObj[currentIndex] = object;
            currentIndex++;
        }
        return newObj;
    }

    @Override
    public boolean add(Object o) {
        if (lastIndex == objects.length - 1) {
            newObj = new Object[(int) (objects.length * 1.5)];

            newObj = ArrayUtils.add(newObj, o);
            newObj = ArrayUtils.add(newObj, objects);

        } else {
            objects[currentIndex++] = o;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        currentIndex = 0;
        while (currentIndex < objects.length) {
            if (objects[currentIndex] == o) {
                objects = ArrayUtils.remove(objects, currentIndex);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        newObj = ArrayUtils.addAll(objects.clone(), c.toArray());
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (index == 0) {
            return false;
        }
        currentIndex = 0;
        Object next = null;
        for (Iterator iterator = c.iterator(); iterator.
                hasNext(); ) {
            if (currentIndex >= index) {
                if (!add((next))) {
                    return false;
                }
            }
            currentIndex++;
            next = iterator.next();
        }
        return add(next);
    }

    @Override
    public void clear() {
        for (Object object : objects) {
            object = null;
        }

    }

    @Override
    public Object get(int index) {
        for (currentIndex = 0; currentIndex < objects.length; currentIndex++) {
            if (currentIndex == index) {
                return objects[currentIndex];
            }
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        if (lastIndex == objects.length - 1) {
            newObj = new Object[(int) (objects.length * 1.5)];
            for (currentIndex = 0; currentIndex <= objects.length; currentIndex++) {
                if (currentIndex == index) {
                    newObj[currentIndex] = element;
                } else {
                    newObj[currentIndex] = objects[currentIndex];
                }
            }
        } else {
            for (currentIndex = 0; currentIndex <= objects.length; currentIndex++) {
                if (currentIndex == index) {
                    objects[currentIndex] = element;
                }
            }
        }

        return element;
    }

    @Override
    public void add(int index, Object element) {
        if (lastIndex == objects.length - 1) {
            newObj = new Object[(int) (objects.length * 1.5)];
            currentIndex = 0;
            for (int currentIndex1 = currentIndex; currentIndex <= objects.length; currentIndex++, currentIndex1++) {
                if (currentIndex == index) {
                    newObj[currentIndex] = element;
                    currentIndex1--;
                }
            }
        } else {
            currentIndex = 0;
            for (int currentIndex1 = currentIndex; currentIndex <= objects.length; currentIndex++, currentIndex1++) {
                if (currentIndex == index) {
                    objects[currentIndex] = element;
                    currentIndex1--;
                }
            }
        }

    }

    @Override
    public Object remove(int index) {
        Object removed = objects[index];
        ArrayUtils.remove(objects, index);
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        return ArrayUtils.indexOf(objects, o);
    }

    @Override
    public int lastIndexOf(Object o) {
        for(currentIndex = objects.length-1; currentIndex >= 0; currentIndex--) {
            if(objects[currentIndex] == o) {
                return currentIndex;
            }
        }
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        ListIterator<Object> itr;
        LinkedList<Object> l = new LinkedList<>();
        itr = l.listIterator(0);
        return (ListIterator) itr.next();
    }

    @Override
    public ListIterator listIterator(int index) {
        ListIterator<Object> itr;
        LinkedList<Object> l = new LinkedList<>();
        itr = l.listIterator(index);
        return (ListIterator) itr.next();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List list = new ArrayList();
        for(currentIndex = fromIndex; currentIndex <= toIndex; currentIndex++) {
            list.add(objects[currentIndex]);
        }
        return list;
    }

    @Override
    public boolean retainAll(Collection c) {
        for(Object object: objects) {
            if(!c.contains(object)) {
                ArrayUtils.removeElement(objects, object);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for(Object object: objects) {
            if(c.contains(object)) {
                ArrayUtils.removeElement(objects, object);
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for(Object object: objects) {
            if(!c.contains(object)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return Arrays.copyOf(a, a.length);
    }

}
