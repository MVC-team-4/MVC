package customerPage.model;

public class CustomerGrade {
	
	String vvip="160000";
	String vip="80000";
	String gold="40000";
	public CustomerGrade() {
		// TODO Auto-generated constructor stub
	}
	public CustomerGrade(String vvip, String vip, String gold) {
		super();
		this.vvip = vvip;
		this.vip = vip;
		this.gold = gold;
	}
	public String getVvip() {
		return vvip;
	}
	public void setVvip(String vvip) {
		this.vvip = vvip;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public String getGold() {
		return gold;
	}
	public void setGold(String gold) {
		this.gold = gold;
	}
	@Override
	public String toString() {
		return "CustomerGrade [vvip=" + vvip + ", vip=" + vip + ", gold=" + gold + "]";
	}
	

}
