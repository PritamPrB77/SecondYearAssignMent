package week9day2;
class node{
	private int value;private  node leftc; private node rightc;
	node(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public node getLeftc() {
		return leftc;
	}
	public void setLeftc(node leftc) {
		this.leftc = leftc;
	}
	public node getRightc() {
		return rightc;
	}
	public void setRightc(node rightc) {
		this.rightc = rightc;
	}
}
