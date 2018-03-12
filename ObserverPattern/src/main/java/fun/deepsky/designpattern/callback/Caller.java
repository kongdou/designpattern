package fun.deepsky.designpattern.callback;

/**
 * 调用回调函数的类
 * @author deepsky
 *
 */
public class Caller{

	public void call(ICallBack icallBack) {
		icallBack.callBack();
	}
}
