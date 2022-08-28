package Ex_66_arratList.Ex4;

import java.util.*;

public class MyVector implements List{
	Object[] data = null;
	int size = 0;
	int capacity = 0;

	public MyVector(int n) {
		data = new Object[n];
	}

	public MyVector() {
		this(10);
	}

	public void setCapacity(int capacity){
		if (this.capacity == capacity) return;

		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}


	public void ensureCapacity(int minCapacity){
		if (minCapacity > this.capacity)
			setCapacity(minCapacity);
	}


	@Override
	public boolean add(Object o) {
		ensureCapacity(size + 1);
		data[size++] = o;
		return true;
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
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
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		Object target = data[index];
		if (index != size - 1){
			System.arraycopy(data, index + 1, data, index, size - index + 1);
		}
		data[size - 1] = null;
		size--;
		return target;
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
	public boolean remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (obj.equals(data[i])){
				remove(i);
				return true;
			}
		}
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
	public void clear() {
		for (int i = 0; i < size; i++) {
			data[i] = null;
 		}
		size = 0;
	}

	public void trimToSize(){
		setCapacity(size);
	}



	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return new Object[0];
	}


}
