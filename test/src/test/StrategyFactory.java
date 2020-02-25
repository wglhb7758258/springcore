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
		
		//java8�÷�
		//toMap ��һ��������һ��Function����Ӧ Map �е� key���ڶ�������Ҳ��һ��Function��strategy -> strategy�� ���strategy �Ǳ��� strategies �е�ÿһ��strategy���ұ�strategy���� Map ��Ӧ value ֵ��		
		map = strategies.stream().collect(Collectors.toMap(Strategy::getType,strategy -> strategy));
	
		//��ͬ����
	/*	map = new HashMap<>();
		for (Strategy strategy2 : strategies) {
			map.put(strategy2.getType(), strategy2);
		}*/
	}
	
	//��̬�ڲ��൥��������ģʽʵ�ֵ�һ�֣����Ǳ����ص�
	//���������ִ���һ�� StrategyFactory �����ࡣStrategyFactory ������ʹ�õ��Ǿ�̬�ڲ��൥�����ڹ��췽����ʱ�򣬳�ʼ���� ��Ҫ�� Strategy������ list ת��Ϊ map��s
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
