package fun.deepsky.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现被观察者，举例：微信公众号服务，订阅者订阅该微信公众账号，当公众号变化后，通知订阅者
 * @author deepsky
 *
 */
public class WechatServer implements Observerable{

	//观察者列表
	private List<Observer> list;
	
	private String message;
	
	public WechatServer() {
		list = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(!list.isEmpty()) {
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		list.forEach((Observer o)->{
			o.update(message);
		});
	}
	
	public void setInformation(String s) {
		this.message = s;
		System.out.println("服务器更新消息："+s);
		//通知所有观察者
		notifyObserver();
	}

}
