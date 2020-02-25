package test;

public class OrdinaryStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("普通会员不打折");
		return money;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 1;
	}

}
