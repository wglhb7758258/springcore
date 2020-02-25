package test;

public class PlatinumStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("白金会员 优惠50元，再打7折");
		return (money-50)*0.7;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 4;
	}

}
