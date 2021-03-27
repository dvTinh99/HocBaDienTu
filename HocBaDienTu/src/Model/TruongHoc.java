package Model;

public class TruongHoc {
	int Ma_school ;
	String Ten_truong;
	String Dia_chi;
	int Ma_cap;
	
	public TruongHoc() {
	}

	public TruongHoc(int ma_school, String ten_truong, String dia_chi, int ma_cap) {
		this.Ma_school = ma_school;
		this.Ten_truong = ten_truong;
		this.Dia_chi = dia_chi;
		this.Ma_cap = ma_cap;
	}

	public TruongHoc(String ten_truong, String dia_chi, int ma_cap) {
		super();
		Ten_truong = ten_truong;
		Dia_chi = dia_chi;
		Ma_cap = ma_cap;
	}

	public int getMa_school() {
		return Ma_school;
	}

	public void setMa_school(int ma_school) {
		Ma_school = ma_school;
	}

	public String getTen_truong() {
		return Ten_truong;
	}

	public void setTen_truong(String ten_truong) {
		Ten_truong = ten_truong;
	}

	public String getDia_chi() {
		return Dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		Dia_chi = dia_chi;
	}

	public int getMa_cap() {
		return Ma_cap;
	}

	public void setMa_cap(int ma_cap) {
		Ma_cap = ma_cap;
	}
	
	

}
