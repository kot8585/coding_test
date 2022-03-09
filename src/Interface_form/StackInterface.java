package Interface_form;

public interface StackInterface<E> {

	E push(E item);

	/**
	 * 스택의 맨 위에 있는 요소를 제거하고 제거 된 요소를 반환합니다.
	 * @return
	 */
	E pop();
}
