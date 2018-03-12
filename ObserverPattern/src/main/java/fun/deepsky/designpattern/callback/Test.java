package fun.deepsky.designpattern.callback;

public class Test {

	public static void main(String[] args) {
		Caller caller = new Caller();
		caller.call(new ICallBack() {
			@Override
			public void callBack() {
				System.out.println("回调函数");
			}
		});
		
	}
}
