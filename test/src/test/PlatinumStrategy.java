package test;

public class PlatinumStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("�׽��Ա �Ż�50Ԫ���ٴ�7��");
		return (money-50)*0.7;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 4;
	}

}
