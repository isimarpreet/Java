package lect8;

public class global_var_demo {
	static int global=1000;

	public static void main(String[] args) {
    int a=10;
    System.out.println("Main vala: " + a);
    System.out.println(global);
    global+=10;
    fun();
    System.out.println(global);

	}
	public static void fun() {
		int a=5;
		System.out.println("Func vala:" + a);
		System.out.println(global);
		global+=100;
	}

}
