package inflearn.q39;

public class Main {
//	public static void main(String[] args) {
//		Main main = new Main();
//		Scanner scanner = new Scanner(System.in);
//
//		int boardLength = scanner.nextInt();
//		HashMap<Integer, Queue<Integer>> board = new HashMap<>();
//
//		int boardSpaceValue;
//		for (int i = 1; i <= boardLength; i++) {
//			for (int j = 1; j <= boardLength; j++) {
//				Stack<Integer> boardSpace = board.getOrDefault(j, new Queue<Integer>() {});
//				boardSpaceValue = scanner.nextInt();
//				boardSpace.push(boardSpaceValue);
//				board.put(j, boardSpace);
//			}
//		}
//
//		int movesLength = scanner.nextInt();
//		int[] moves = new int[movesLength];
//		for (int i = 0; i < movesLength; i++) {
//			moves[i] = scanner.nextInt();
//
//		}
//
//		System.out.println(main.solution(board, moves));
//	}
//
//	private int solution(HashMap<Integer, Stack<Integer>> board, int[] moves) {
//		//꺼내서 Stack 담기 왜냐면 터지면 바로 위에꺼를 꺼내야 되니까
//		Stack<Integer> movesValue = new Stack<>(); //꺼내진 애들
//		int explodeCount = 0;
//		for (int i = 0; i < moves.length; i++) {
//			int move = moves[i];
//			Queue<Integer> boardVertical = board.get(move);
//
//			Integer boardSpaceValue;
//
//			while((boardSpaceValue = boardVertical.pop()) == 0);
//
//			//꺼냇는데 만약에 이미 들어있는애랑 똑같아? 그러면 넣지않고 맨 위에꺼 pop
//			// 근데 peek했는데 size가 0이면 어덯게 되니?
//			if (movesValue.isEmpty()) {
//				movesValue.push(boardSpaceValue);
//			} else {
//				if (Objects.equals(movesValue.peek(), boardSpaceValue)) {
//					movesValue.pop();
//					explodeCount++;
//				} else {
//					movesValue.push(boardSpaceValue);
//				}
//			}
//		}
//		return explodeCount;
//	}

}
