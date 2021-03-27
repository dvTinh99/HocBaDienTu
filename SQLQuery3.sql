
alter table Mon_Hoc add thaythe varchar(255) 
use HocBaDienTu
alter table Mon_Hoc drop COLUMN  thaythe
Update Mon_Hoc SET thaythe = rowguid
alter table Mon_Hoc drop COLUMN  rowguid
insert Mon_Hoc(Ma_Mon,Ten_Mon,rowguid) values(2,'Van',null)
INSERT Mon_Hoc(Ma_Mon,Ten_Mon) VALUES(3,N'Lich Su'),(4,N'Dia li');