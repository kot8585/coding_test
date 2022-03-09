package Interface_form;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

	private static final int DEFAULT_CAPACITY = 10; //최소 기본 동적 크기
	private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

	private int size; //요소개수

	Object[] array;

	// 생성자1 (초기 공간 할당 X)
	//ex) List list = new ArrayList()
	public ArrayList() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}

	//생성자2 (초기 공간 할당 O)
	//사용자가 데이터의 개수를 예측할 수 있어서 미리 공간 할당을 해놓고 싶을 경우
	//ArrayList<Integer> list = new ArrayList<>(100);
	public ArrayList(int capacity) {
		this.array = new Object[capacity];
		this.size = 0;
	}

	/**
	 * 동적할당을 위한 resize 메서드 구현
	 * size가 capacity에 얼만큼 차있는지를 확인하고, 적절한 크기에 맞게 배열의 용적을 변경해야한다.
	 * 용적은 외부에서 마음대로 접근하면 데이터의 손상을 야기할 수 있기 때뮨에 private로 접근 제한
	 */
	private void resize() {
		//if문으로 바로 return
		int array_capacity = array.length;

		//NOTE. 주소가 아닌 값을 비교할때는 Arrays.equals()
		if (Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}

		//NOTE. Arrays.copyOf()
		// 복사할 배열보다 용적의 크기가 클 경우 먼저 배열을 복사한 뒤 나머지 빈 공간은 null로 채운다.
		if (size == array_capacity) {
			int new_capacity = array_capacity * 2;

			array = Arrays.copyOf(array, new_capacity);
			return;
		}

		//용적의 절반 미만으로 요소가 차지하고 있을 경우
		if (size < (array_capacity / 2)) {
			int new_capacity = array_capacity / 2;

			array = Arrays.copyOf(array, new_capacity);
			return;
		}
	}

	@Override
	public boolean add(E value) {
		addLast(value);
		return true;
	}

	public void addLast(E value) {

		//꽉차있는 상태라면 용적 재할당
		if (size == array.length) {
			resize();
		}

		array[size] = value;
		size++;
	}

	@Override
	public void add(int index, E value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		if (index == size) {
			addLast(value);
		} else {

			if (size == array.length) {
				resize();
			}

			//한칸씩 미루기
			for (int i = size; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = value;
			size++;
		}

	}

	public void addFirst(E value) {
		add(0, value);
	}

	@Override
	public boolean remove(Object value) {
		return false;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public void set(int index, E value) {

	}

	@Override
	public boolean contains(Object value) {
		return false;
	}

	@Override
	public boolean indexOf(Object value) {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void clear() {

	}
}
