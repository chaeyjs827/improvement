package designPattern.behavior.observer_sec;

import java.util.ArrayList;
import java.util.List;

/*
 * Observer는 Subject에서 생긴 변화에 관심을 갖는다.
 * 
 * 공부는 내일 마저 하자... 오늘은 정말 너무 졸려서 진행이 어렵다.
 */

public class PlatformService implements Observable {
	List<Observer> observerList = new ArrayList<>();
	
	private boolean newContents;
	
}
