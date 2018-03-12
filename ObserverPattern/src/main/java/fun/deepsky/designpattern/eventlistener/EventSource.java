package fun.deepsky.designpattern.eventlistener;

import java.util.Vector;

public class EventSource {

	private Vector<MyEventListener> listeners = new Vector<MyEventListener>();
	
	public void addListener(MyEventListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(MyEventListener listener) {
		listeners.remove(listener);
	}
	
	public void notifyListenerEvents(MyEventObject eventObject) {
		listeners.forEach((MyEventListener listener)->{
			listener.handleEvent(eventObject);
		});
	}
	
}
