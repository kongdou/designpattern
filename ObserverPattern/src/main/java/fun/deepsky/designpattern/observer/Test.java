package fun.deepsky.designpattern.observer;

public class Test {

	public static void main(String[] args) {
		WechatServer server = new WechatServer();
		
		Observer user1 = new User("zhangsan");
		Observer user2 = new User("lisi");
		Observer user3 = new User("wangwu");
		
		server.registerObserver(user1);
		server.registerObserver(user2);
		server.registerObserver(user3);
		
		server.setInformation("请关注");
		
		server.removeObserver(user1);
		server.setInformation("张三取消关注");
		
	}
}
