package test;

public class getResultTest {
	private static double getResult(long money, int type) {

	    if (money < 1000) {
	        return money;
	    }

	    Strategy strategy = StrategyFactory.getInstance().get(type);

	    if (strategy == null){
	        throw new IllegalArgumentException("please input right type");
	    }

	    return strategy.compute(money);
	}
	
	public static void main(String[] args) {
		//���ˣ�ͨ��һ�������࣬�������� getResult�������õ�ʱ�򣬸��ݴ��� type�����ɻ�ȡ�� ��Ӧ Strategy.
		System.out.println(getResult(1000, 3));
		
	}
}
