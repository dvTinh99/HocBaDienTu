package Model;

public class Diem {
	int Ma_diem;
	int Ma_hs;
	int Ma_PC;
	int Ma_mon;
	int Ma_Cap;
	public int getMa_Cap() {
		return Ma_Cap;
	}

	public void setMa_Cap(int ma_Cap) {
		Ma_Cap = ma_Cap;
	}

	String Diem;
	String TenMonHoc;
	
	public String getTenMonHoc() {
		return TenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		TenMonHoc = tenMonHoc;
	}

	Diem(){}
	public Diem(String tenMon,String Diem) {
		this.TenMonHoc = tenMon;
		this.Diem = Diem;
		
	}

	public Diem(int ma_diem, int ma_hs, int ma_PC, int ma_mon, String diem) {
		super();
		Ma_diem = ma_diem;
		Ma_hs = ma_hs;
		Ma_PC = ma_PC;
		Ma_mon = ma_mon;
		Diem = diem;
	}

	public int getMa_diem() {
		return Ma_diem;
	}

	public void setMa_diem(int ma_diem) {
		Ma_diem = ma_diem;
	}

	public int getMa_hs() {
		return Ma_hs;
	}

	public void setMa_hs(int ma_hs) {
		Ma_hs = ma_hs;
	}

	public int getMa_PC() {
		return Ma_PC;
	}

	public void setMa_PC(int ma_PC) {
		Ma_PC = ma_PC;
	}

	public int getMa_mon() {
		return Ma_mon;
	}

	public void setMa_mon(int ma_mon) {
		Ma_mon = ma_mon;
	}

	public String getDiem() {
		return Diem;
	}

	public void setDiem(String diem) {
		Diem = diem;
	}
	
	
}
