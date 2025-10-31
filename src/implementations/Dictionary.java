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
	 * Default constructor - creates a Dictionary using DEFAULT_SIZE constant.
	 */
	public Dictionary()
	{
		create(DEFAULT_SIZE);
	}

	/**
	 * Constructor overload with capacity argument.
	 *
	 * @param size The initialized capacity of the dictionary
	 */
	public Dictionary(int size)
	{
		create(size);
	}

	/**
	 * Constructor which creatde a new Dictionary object, and initializes the
	 * counterpart ArrayLists representing keys:values.
	 *
	 * Precondition: None.
	 *
	 * Postcondition: A dictionary object is created and its size is
	 * initialized to the value in the argument, or a default of 10.
	 *
	 * @param size The initialized capacity of the dictionary
	 */
	@Override
	public void create(int size)
	{
		keys = new ArrayList<K>(size);
		values = new ArrayList<V>(size);
	}

	/**
	 * Mutator method to insert a new key:value pair into the Dictionary.
	 *
	 * Precondition: Dictionary object exists, and arguments must not be null.
	 *
	 * Postcondition: Key:value pair is added to the Dictionary.
	 *
	 * @param key The key 
	 * @param value The associated value
	 * 
	 * @return true if key:value pair has been added successfully
	 * 
	 * @throws DuplicateKeyException if the key already exists in the dictionary
	 */
	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException 
	{
		if (keys.contains(key))
		{
			throw new DuplicateKeyException("Key already exists in the dictionary: " + key);
		}
		
		keys.add(key);
		values.add(value);
		
		return true;
	}

	/**
	 * Mutator method that removes a specified key:value pair from the Dictionary.
	 *
	 * Precondition: Dictionary object exists and a not null key
	 * is passed as argument.
	 *
	 * Postcondition: The key:value pair is removed from the Dictionary.
	 *
	 * @param key The key to remove
	 * 
	 * @return the value of the target key we removed || null if key does not exist
	 */
	@Override
	public V remove(K key)
	{
		int keyIndex = keys.indexOf(key);

		if (keyIndex == -1)
		{
			return null;
		}

		V removedValue = values.remove(keyIndex);
		keys.remove(keyIndex);

		return removedValue;
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
