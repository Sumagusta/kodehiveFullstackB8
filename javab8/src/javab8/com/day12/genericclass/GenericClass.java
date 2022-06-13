package javab8.com.day12.genericclass;


public class GenericClass<T> {
	
	T obj; // global obj variable
	
	public GenericClass(T obj) { // set
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
}
