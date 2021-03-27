package Model;

public class MonHoc {
	int Ma_mon;
	String Ten_mon;
	int Ma_cap;
	MonHoc(){}
	public MonHoc(int ma_mon, String ten_mon) {
		super();
		Ma_mon = ma_mon;
		Ten_mon = ten_mon;
	}
	
	public MonHoc(int ma_mon, String ten_mon, int ma_cap) {
		super();
		Ma_mon = ma_mon;
		Ten_mon = ten_mon;
		Ma_cap = ma_cap;
	}
	public int getMa_mon() {
		return Ma_mon;
	}
	public void setMa_mon(int ma_mon) {
		Ma_mon = ma_mon;
	}
	public String getTen_mon() {
		return Ten_mon;
	}
	public void setTen_mon(String ten_mon) {
		Ten_mon = ten_mon;
	}
	public int getMa_cap() {
		return Ma_cap;
	}
	public void setMa_cap(int ma_cap) {
		Ma_cap = ma_cap;
	}
	
	
}
