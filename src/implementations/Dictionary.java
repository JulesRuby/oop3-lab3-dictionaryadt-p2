package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	/**
	 * Default constructor - creates a Dictionary with default size.
	 */
	public Dictionary()
	{
		create(DEFAULT_SIZE);
	}

	/**
	 * Constructor with specified initial capacity.
	 *
	 * @param size The initial capacity of the dictionary
	 */
	public Dictionary(int size)
	{
		create(size);
	}

	@Override
	public void create(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(K key, V value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V lookup(K key) {
		// TODO Auto-generated method stub
		return null;
	}

}
