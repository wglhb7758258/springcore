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
		//至此，通过一个工厂类，在我们在 getResult（）调用的时候，根据传入 type，即可获取到 对应 Strategy
		System.out.println(getResult(1000, 3));
		
	}
}
