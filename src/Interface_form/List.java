package Interface_form;
/*
List는 ArrayList, SinglyLinkedList, DoublyLinked에 의해 각각 구현된다.
 */
public interface List<E> {

	boolean add(E value);

	/*
	 * 리스트에 요소를 특정 위치에 추가한다.
	 * 특정 위치 및 이휴의 요소들은 한 칸씩 뒤로 밀린다.
	 */
	void add(int index, E value);

	/* 리스트에서 특정 요소를 삭제한다.
	 *  동인한 요소가 여러 개일 경우 가장 처음 발견한 요소만 삭제된다.
	 * return 리스트에 삭제할 요소가 없거나 삭제에 실패할 경우 false 반환
	 */
	boolean remove(Object value);

	E get(int index);

	/*
	리스트에 있는 특정 위치의 요소를 새 요소로 대체한다.
	 */
	void set(int index, E value);

	/*
	리스트에 트정 요소가 리스트에 있는지 여부 확인
	 */
	boolean contains(Object value);

	/*
	라수투애 툭정 요소가 몇 번째 위치에 있는지를 반환한다.
	return 리스트에서 처음으로 요소와 일치하는 위치를 반환.
			만약 일치하는 요소가 없을경우 -1 반환
	 */
	boolean indexOf(Object value);

	int size();

	boolean isEmpty();

	public void clear();
}
