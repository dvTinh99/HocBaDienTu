/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [Ma_Mon]
      ,[Ten_Mon]
      ,[rowguid]
      ,[Ma_Cap]
  FROM [HocBaDienTu].[dbo].[Mon_Hoc]


select Ten_Mon ,
	(select Diem from Diem where Ma_hs =1 )
from Mon_Hoc
where Ma_Cap = 3


   select (select Mon_Hoc.Ten_Mon from Mon_Hoc where Diem.Ma_Mon = Mon_Hoc.Ma_Mon )as TenMon, Diem
 from Diem
 where Ma_hs = 1
 
create view DiemByID AS
SELECT Mon_Hoc.Ten_Mon,Diem.Diem,Mon_Hoc.Ma_Cap,Diem.Ma_hs,Mon_Hoc.Ma_Khoi_Hoc
FROM Mon_Hoc
INNER JOIN Diem ON Mon_Hoc.Ma_Mon = Diem.Ma_Mon
where Mon_Hoc.Ma_Cap = 3 and Diem.Ma_hs = 1 and Mon_Hoc.Ma_Khoi_Hoc = 11

select * from DiemByID where Ma_Cap = 3 and Ma_hs = 1 and Ma_Khoi_Hoc = 10

drop view DiemByID