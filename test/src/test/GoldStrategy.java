package test;

public class GoldStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("�ƽ��Ա 8��");
		return money*0.8;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 3;
	}

}
