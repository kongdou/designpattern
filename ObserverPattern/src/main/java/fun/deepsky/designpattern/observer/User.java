package fun.deepsky.designpattern.observer;

/**
 * 具体观察者实现类，实现各自的update方法
 * @author deepsky
 *
 */
public class User implements Observer {

	private String name;
	private String message;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		this.message = message;
		read();
	}
	
	public void read() {
		System.out.println(name+"接收到的信息："+message);
	}

}
