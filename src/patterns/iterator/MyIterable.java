package patterns.iterator;

public interface MyIterable<T> {

	public MyIterator<T> createIterator();
}
