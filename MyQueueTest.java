package LinkList;

import org.junit.Assert;
import org.junit.Test;

import LinkListPractice.INode;
import LinkListPractice.MyNode;

public class MyQueueTest {
	@Test
	public void given3NumberInQueuekWhenPopedShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode peak = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, peak);
	}

}
