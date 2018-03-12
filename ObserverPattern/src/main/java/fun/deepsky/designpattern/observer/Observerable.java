package fun.deepsky.designpattern.observer;

/**
 * 抽象被观察者接口，声明增加、删除、通知观察者方法
 * @author deepsky
 *
 */
public interface Observerable {

	/**
	 * 注册观察者
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 删除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 通知观察者
	 * @param o
	 */
	public void notifyObserver();
	
}
