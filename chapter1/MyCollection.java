package da;

public class MyCollection<T> {

	private T[] arr;
	
	@SuppressWarnings("unchecked")
	public MyCollection() {
		this.arr = (T[]) new Object[10];
	}

	public boolean isEmpty() {
		if (this.arr == null || this.arr.length == 0)
			return false;
		boolean f = true;
		for (T t : arr) {
			if (t != null) {
				f = false;
				break;
			}
		}
		return f;
	}

	@SuppressWarnings("unused")
	public void makeEmpty() {
		if (this.isEmpty())
			return;

		for (T t : arr) {
			t = null;
		}
	}

	@SuppressWarnings("unchecked")
	public void insert(T t) {
		int len = this.arr.length;

		T[] newArr = (T[]) new Object[len + 1];

		for (int i = 0; i < len + 1; i++) {
			if(i < len && arr[i] != null) 
				newArr[i] = arr[i];
			else {
				newArr[i] = t;
				break;
			}
		}
		
		this.arr = newArr;
	}

	@SuppressWarnings("unchecked")
	public void insert(T t, int index) throws Exception {
		int len = this.arr.length;

		T[] newArr = (T[]) new Object[len + 1];

		for (int i = 0; i < len + 1; i++) {
			if (i < index)
				newArr[i] = arr[i];
			if (i == index)
				newArr[i] = t;
			if (i > index)
				newArr[i] = arr[i - 1];
		}

		this.arr = newArr;
	}

	@SuppressWarnings("unchecked")
	public void remove(int index) {
		int len = this.arr.length;

		T[] newArr = (T[]) new Object[len - 1];

		for (int i = 0; i < len + 1; i++) {
			if (i < index)
				newArr[i] = arr[i];
			if (i > index)
				newArr[i] = arr[i + 1];
		}

		this.arr = newArr;
	}

	public boolean isPresent(T exp) {
		if (exp == null)
			return false;
		if (this.isEmpty())
			return false;
		boolean f = false;
		for (T t : arr) {
			if (exp.equals(t)) {
				f = true;
				break;
			}
		}
		return f;
	}

	public Object[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

}
