package javab8.com.day12.genericmethod;

public class GenericMethod<T> {

	T obj;
	
	public T get() {
		return obj;
	}
	
	public void set(T obj) {
		this.obj = obj;
	}
	
}
