package test;

public class SilverStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("�׽��Ա�Ż�50Ԫ");
		return money-50;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 2;
	}

}
