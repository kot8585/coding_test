package inflearn.dfs.BFS;

import java.util.LinkedList;
import java.util.Queue;

//TODO : 여럽다 이진트리 레벨 탐
class Node{
	int data;
	Node lt;
	Node rt;

	public Node(int data) {
		this.data = data;
		lt = rt = null;
	}

}

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Node root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		main.BFS(root);
	}

	private void BFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			System.out.println("level : " + level);
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				System.out.print(node.data + " ");
				if(node.lt != null) queue.offer(node.lt);
				if(node.rt != null) queue.offer(node.rt);
			}
			level++;
			System.out.println();
		}
	}
}
