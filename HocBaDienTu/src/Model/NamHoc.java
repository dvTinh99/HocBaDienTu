package Model;

public class NamHoc {
	int Ma_namHoc ;
	int Ma_school;
	String Ten_namHoc;
	String Nam_batDau;
	String Nam_ketThuc;
	
	NamHoc(){}

	public NamHoc(int ma_namHoc, int ma_school, String ten_namHoc, String nam_batDau, String nam_ketThuc) {
		super();
		Ma_namHoc = ma_namHoc;
		Ma_school = ma_school;
		Ten_namHoc = ten_namHoc;
		Nam_batDau = nam_batDau;
		Nam_ketThuc = nam_ketThuc;
	}

	public int getMa_namHoc() {
		return Ma_namHoc;
	}

	public void setMa_namHoc(int ma_namHoc) {
		Ma_namHoc = ma_namHoc;
	}

	public int getMa_school() {
		return Ma_school;
	}

	public void setMa_school(int ma_school) {
		Ma_school = ma_school;
	}

	public String getTen_namHoc() {
		return Ten_namHoc;
	}

	public void setTen_namHoc(String ten_namHoc) {
		Ten_namHoc = ten_namHoc;
	}

	public String getNam_batDau() {
		return Nam_batDau;
	}

	public void setNam_batDau(String nam_batDau) {
		Nam_batDau = nam_batDau;
	}

	public String getNam_ketThuc() {
		return Nam_ketThuc;
	}

	public void setNam_ketThuc(String nam_ketThuc) {
		Nam_ketThuc = nam_ketThuc;
	}
	

}
