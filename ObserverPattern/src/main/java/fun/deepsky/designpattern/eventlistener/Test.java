package fun.deepsky.designpattern.eventlistener;

public class Test {

	public static void main(String[] args) {
		//事件源
		EventSource source = new EventSource();
		//监听
		source.addListener(new MyEventListener() {
			
			@Override
			public void handleEvent(MyEventObject object) {
				object.doEvent();
				if(object.getSource().equals("closeWindows")) {
					System.out.println("close windows");
				}else {
					System.out.println("other event:"+object.getSource());
				}
			}
		});		
		//
		source.notifyListenerEvents(new MyEventObject("openWindows"));
	}

}
