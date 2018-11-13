package finn.test;

public class test1 {
	private void v(Object o){
		System.out.println(o);
	}
	public void v1(Object o){
		v(o);
	}
	public static void main(String[] args) {
		test1 t = new test1();
		t.v1("test1");
		t.v("test2");
	}
}
