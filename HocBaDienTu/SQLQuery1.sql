use HocBaDienTu
CREATE TABLE Cap (
    Ma_cap int NOT NULL,
    Ten_cap varchar(255) NOT NULL,
    PRIMARY KEY (Ma_cap)
);
CREATE TABLE Truong_Hoc (
    Ma_school int NOT NULL,
    Ten_truong varchar(255) NOT NULL,
	Dia_chi varchar(255),
	Ma_cap int
    PRIMARY KEY (Ma_school)
	FOREIGN KEY (Ma_cap) REFERENCES Cap(Ma_cap)
);
create table Hoc_sinh(
	Ma_hs int,
	Ma_school int,
	Ho varchar,
	Ten varchar,
	Gioi_Tinh varchar,
	Ngay_Sinh varchar,
	Dia_Chi varchar,
	Sdt varchar,
	CMND varchar,

	primary key(Ma_hs),
	FOREIGN KEY (Ma_school) REFERENCES Truong_Hoc(Ma_school)
);
create table Giao_vien(
	Ma_gv int,
	Ma_school int,
	Ho varchar,
	Ten varchar,
	Gioi_Tinh varchar,
	Ngay_Sinh varchar,
	Dia_Chi varchar,
	Sdt varchar,
	CMND varchar,

	primary key(Ma_gv),
	FOREIGN KEY (Ma_school) REFERENCES Truong_Hoc(Ma_school)

);
create table Khoi_Hoc(
	MaKH int,
	TenKH varchar,
	Ma_school int,
	primary key(MaKH),
	FOREIGN KEY (Ma_school) REFERENCES Truong_Hoc(Ma_school)

);

create table Nam_Hoc(
	Ma_namhoc int,
	Ma_school int,
	Ten_namhoc varchar,
	Nam_batdau varchar,
	Nam_ketthuc varchar,

	primary key(Ma_namhoc),
	FOREIGN KEY (Ma_school) REFERENCES Truong_Hoc(Ma_school)
);

create table HocKy(
	Ma_hk int,
	Ma_namhoc int,
	Ten_hk varchar,
	Ngay_batdau datetime,
	Ngay_ketthuc datetime,

	primary key(Ma_hk),
	FOREIGN KEY (Ma_namhoc) REFERENCES Nam_Hoc(Ma_namhoc)
);

create table Mon_Hoc(
	Ma_Mon int,
	Ten_Mon int,

	primary key(Ma_Mon)
);

create table Lop_Hoc(
	Ma_class int,
	Ma_KH int,
	Ma_namhoc int,
	Ma_gvcn int,

	primary key(Ma_class),
	FOREIGN KEY (Ma_namhoc) REFERENCES Nam_Hoc(Ma_namhoc),
	FOREIGN KEY (Ma_KH) REFERENCES Khoi_Hoc(MaKH),
	FOREIGN KEY (Ma_gvcn) REFERENCES Giao_vien(Ma_gv)
);
create table Phan_Cong(
	Ma_PC int,
	Ma_GV int,
	Ma_class int,
	Ma_HK int,
	Ma_Mon int,

	primary key(Ma_PC),
	FOREIGN KEY (Ma_class) REFERENCES Lop_Hoc(Ma_class),
	FOREIGN KEY (Ma_HK) REFERENCES HocKy(Ma_hk),
	FOREIGN KEY (ma_GV) REFERENCES Giao_vien(Ma_gv)

);
create table Xep_lop(
	Ma_hs int,
	Ma_class int,

	FOREIGN KEY (Ma_class) REFERENCES Lop_Hoc(Ma_class),
	FOREIGN KEY (Ma_hs) REFERENCES Hoc_sinh(Ma_hs),
);

create table Diem(
	Ma_Diem int,
	Ma_hs int,
	Ma_PC int,
	Ma_Mon int ,
	Diem varchar,
	
	primary key(Ma_Diem),
	FOREIGN KEY (Ma_hs) REFERENCES Hoc_sinh(Ma_hs),
	FOREIGN KEY (Ma_PC) REFERENCES Phan_Cong(Ma_PC),
	FOREIGN KEY (Ma_Mon) REFERENCES Mon_Hoc(Ma_Mon)

);

use HocBaDienTu
create table Xep_loai(
	Ma_hs int,
	Ma_hk int,
	TB_Mon float(5),
	Hoc_luc varchar,
	Hanh_kiem varchar,
	Xet_len_lop int,

	FOREIGN KEY (Ma_hs) REFERENCES Hoc_sinh(Ma_hs),
	FOREIGN KEY (Ma_hk) REFERENCES HocKy(Ma_hk),
);

SELECT * FROM sysobjects  WHERE  name= 'FK__Phan_Cong__Ma_HK__3E52440b'
alter table Phan_Cong drop CONSTRAINt FK__Phan_Cong__Ma_HK__3E52440b
alter table Phan_Cong add FOREIGN KEY (Ma_HK) REFERENCES HocKy(Ma_hk)