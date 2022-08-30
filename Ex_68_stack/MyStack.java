package Ex_68_stack;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
	public Object push(Object item){
		addElement(item);
		return item;
	}

	public Object peek(){
		int len = size();
		if (len == 0){
			throw new EmptyStackException();
		}
		return elementAt(len - 1);
	}

	public Object pop(){
		Object obj = peek();
		removeElementAt(size() -1);
		return obj;
	}

	public int search(Object o){
		int i = lastIndexOf(o); // 배열 끝에서부터 찾음
		if (i >= 0)
			return size() - i;
		return -1;
	}

	public boolean empty(){
		return size() == 0;
	}
}
