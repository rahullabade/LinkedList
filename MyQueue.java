package LinkList;

import LinkListPractice.INode;
import LinkListPractice.MyLinkList;

public class MyQueue {
	private final MyLinkList myLinkList;

	public MyQueue() {
		this.myLinkList = new MyLinkList();
	}

	public void push(INode myNode) {
		myLinkList.add(myNode);
	}

	public void printQueue() {
		myLinkList.printMyNode();
	}

	public INode peak() {
		return myLinkList.head;
	}

	public INode pop() {
		return myLinkList.popLast();
	}

	public void enqueu(INode myNode) {
		myLinkList.append(myNode);
	}
}
