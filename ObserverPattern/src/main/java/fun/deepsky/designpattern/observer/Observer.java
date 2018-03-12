package fun.deepsky.designpattern.observer;

/**
 * 抽象观察者
 * 
 * @author deepsky
 *
 */
public interface Observer {

	/**
	 * 当被观察者调用notifyObserver方法时，观察者的update方法被调用
	 * @param message
	 */
	public void update(String message);
}
