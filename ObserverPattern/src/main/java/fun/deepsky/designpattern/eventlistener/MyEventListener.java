package fun.deepsky.designpattern.eventlistener;

import java.util.EventListener;

public interface MyEventListener extends EventListener{

	public void handleEvent(MyEventObject object);
	
}
