package LinkList;

import LinkListPractice.INode;
import LinkListPractice.MyLinkList;

public class MyStack {
	private final MyLinkList myLinkList;

	public MyStack() {
		this.myLinkList = new MyLinkList();
	}

	public void push(INode myNode) {
		myLinkList.add(myNode);
	}

	public void printStack() {
		myLinkList.printMyNode();
	}

	public INode peak() {
		return myLinkList.head;
	}

	public INode pop() {
		return myLinkList.popLast();
	}
}
