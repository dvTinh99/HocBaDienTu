package Model;

public class KhoiHoc {
	int MaKH;
	String TenKH;
	int Ma_school;
	
	KhoiHoc(){}

	public KhoiHoc(int maKH, String tenKH, int ma_school) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		Ma_school = ma_school;
	}

	public KhoiHoc(int MaKH, String TenKH) {
		this.MaKH = MaKH;
		this.TenKH = TenKH;
	}

	public int getMaKH() {
		return MaKH;
	}

	public void setMaKH(int maKH) {
		MaKH = maKH;
	}

	public String getTenKH() {
		return TenKH;
	}

	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}

	public int getMa_school() {
		return Ma_school;
	}

	public void setMa_school(int ma_school) {
		Ma_school = ma_school;
	}
	
}
