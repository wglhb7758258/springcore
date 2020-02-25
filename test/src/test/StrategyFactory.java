package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrategyFactory {

	private Map<Integer, Strategy> map;
	
	public StrategyFactory(){
		List<Strategy> strategies = new ArrayList<>();
		
		strategies.add(new OrdinaryStrategy());
		strategies.add(new SilverStrategy());
		strategies.add(new GoldStrategy());
		strategies.add(new PlatinumStrategy());
		
		//java8用法
		//toMap 第一个参数是一个Function，对应 Map 中的 key，第二个参数也是一个Function，strategy -> strategy， 左边strategy 是遍历 strategies 中的每一个strategy，右边strategy则是 Map 对应 value 值。		
		map = strategies.stream().collect(Collectors.toMap(Strategy::getType,strategy -> strategy));
	
		//等同上面
	/*	map = new HashMap<>();
		for (Strategy strategy2 : strategies) {
			map.put(strategy2.getType(), strategy2);
		}*/
	}
	
	//静态内部类单例，单例模式实现的一种，不是本文重点
	//我们再着手创建一个 StrategyFactory 工厂类。StrategyFactory 这里我使用的是静态内部类单例，在构造方法的时候，初始化好 需要的 Strategy，并把 list 转化为 map。s
	public static class Holder{
		public static StrategyFactory instance = new StrategyFactory();
	}
	
	public static StrategyFactory getInstance(){
		return Holder.instance;
	}
	
	public Strategy get(Integer type){
		return map.get(type);
	}
}
