
package finalReview;

import java.util.HashMap;

class LNode {
	int key;
	int value;
	LNode pre;
	LNode next;

	public LNode(int key, int value) {
		this.key = key;
		this.value = value;
	}

}

public class LeastRecentlyUsedCacheImplementation {

	int cachSize;
	HashMap<Integer, LNode> map = new HashMap<Integer, LNode>();
	LNode head = null;
	LNode end = null;

	public LeastRecentlyUsedCacheImplementation(int maxSize) {
		this.cachSize = maxSize;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			LNode n = map.get(key);
			remove(n);
			setHead(n);
			System.out.print(n.value);
			return n.value;
		}
		return -1;
	}

	public void remove(LNode n) {
		// ustunden atlamasyon
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}
		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}

	}

	public void setHead(LNode n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}

	public void set(int key, int value) {

		if (map.containsKey(key)) {
			LNode old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			LNode created = new LNode(key, value);
			if (map.size() >= cachSize) {
				map.remove(end.key);
				remove(end);
				setHead(created);
			} else {
				setHead(created);
			}

			map.put(key, created);
		}

		// System.out.println(map);
	}


}
