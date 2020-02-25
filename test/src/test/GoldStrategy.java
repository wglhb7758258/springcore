package test;

public class GoldStrategy implements Strategy {

	@Override
	public double compute(long money) {
		System.out.println("»Æ½ğ»áÔ± 8ÕÛ");
		return money*0.8;
	}

	@Override
	public int getType() {
		//return UserType.SILVER_VIP.getCode();
		return 3;
	}

}
