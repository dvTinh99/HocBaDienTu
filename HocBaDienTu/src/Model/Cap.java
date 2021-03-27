package Model;

public class Cap {
	int Ma_cap;
	String Ten_cap;
	
	Cap(){}

	public Cap(int ma_cap, String ten_cap) {
		super();
		Ma_cap = ma_cap;
		Ten_cap = ten_cap;
	}

	public int getMa_cap() {
		return Ma_cap;
	}

	public void setMa_cap(int ma_cap) {
		Ma_cap = ma_cap;
	}

	public String getTen_cap() {
		return Ten_cap;
	}

	public void setTen_cap(String ten_cap) {
		Ten_cap = ten_cap;
	}
	
}
