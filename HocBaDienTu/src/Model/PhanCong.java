package Model;

public class PhanCong {
	int Ma_PC;
	int Ma_GV;
	int Ma_class;
	int Ma_HK;
	int Ma_mon;
	
	PhanCong(){}

	public PhanCong(int ma_PC, int ma_GV, int ma_class, int ma_HK, int ma_mon) {
		super();
		Ma_PC = ma_PC;
		Ma_GV = ma_GV;
		Ma_class = ma_class;
		Ma_HK = ma_HK;
		Ma_mon = ma_mon;
	}

	public int getMa_PC() {
		return Ma_PC;
	}

	public void setMa_PC(int ma_PC) {
		Ma_PC = ma_PC;
	}

	public int getMa_GV() {
		return Ma_GV;
	}

	public void setMa_GV(int ma_GV) {
		Ma_GV = ma_GV;
	}

	public int getMa_class() {
		return Ma_class;
	}

	public void setMa_class(int ma_class) {
		Ma_class = ma_class;
	}

	public int getMa_HK() {
		return Ma_HK;
	}

	public void setMa_HK(int ma_HK) {
		Ma_HK = ma_HK;
	}

	public int getMa_mon() {
		return Ma_mon;
	}

	public void setMa_mon(int ma_mon) {
		Ma_mon = ma_mon;
	}
	

}
