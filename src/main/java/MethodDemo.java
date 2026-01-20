
public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo d= new MethodDemo();
		String s=d.getData();
		System.out.println(s);
		getUserData g=new getUserData();
		String userinfo=g.userInfo();
        System.out.println(userinfo);
        getdata2();
	}
	public String getData() {
		System.out.println("hello world");	
		return "premraj";
	}
	
	public static String getdata2() {
		System.out.println("hello sir");
		return "getdata2";
	}
}
