package test;

public class OrdinaryStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("��ͨ��Ա������");
		return money;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 1;
	}

}
