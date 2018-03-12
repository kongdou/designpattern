package fun.deepsky.designpattern.eventlistener;

import java.util.EventObject;

public class MyEventObject extends EventObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyEventObject(Object source) {
		super(source);
	}

	public void doEvent() {
		System.out.println("通知一个事件源："+this.source);
	}

}
