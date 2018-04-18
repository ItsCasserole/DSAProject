
public class MyListReferenceBased implements ListInterface{
	private Node head;
	
	public MyListReferenceBased() {
		head = null;
	}
	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else
			return false;
	}

	@Override
	public int size() {
		Node temp = head;
		int counter = 0;
		if(temp == null) {
			return 0;
		}
		else {
			while(temp!=null) {
				temp = temp.getNext();
				counter++;
			}
		}
		return counter;
	}

	@Override
	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index <= size()) {
			if(index != 0) {
				Node prev = find(index-1);
				prev.setNext(new Node(item, prev.getNext()));
			}
			else {
				Node temp = new Node(item, head);
				head = temp;
			}
		}
		else
			throw new ListIndexOutOfBoundsException("Index is out of bounds!");
	}

	@Override
	public Object get(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < size()) {
			return find(index).getItem();
		}
		else
			throw new ListIndexOutOfBoundsException("Index is out of bounds!");
	}

	@Override
	public void remove(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < size()) {
			if(index!=0) {
				Node prev = find(index-1);
				prev.setNext(prev.getNext().getNext());
			}
			else {
				head = head.getNext();
			}
		}
		else
			throw new ListIndexOutOfBoundsException("Index is out of bounds!");
		
	}

	@Override
	public void removeAll() {
		head = null;
	}
	
	public Node find(int index) {
		Node result = head;
		while(index>0) {
			result = result.getNext();
			index--;
		}
		return result;
	}
	
	public String toString() {
		Node temp = head;
		String st = "";
		if(temp == null) {
			return "List is empty.";
		}
		else {
			while(temp!=null) {
				st = st + "\n" + (String) temp.getItem().toString();
				temp = temp.getNext();
			}
		}
		return "List of size " + size()+ " has the following items: "+ st;
	}

}
