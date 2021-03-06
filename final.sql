USE [master]
GO
/****** Object:  Database [HocBaDienTu]    Script Date: 3/25/2021 11:27:41 PM ******/
CREATE DATABASE [HocBaDienTu]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HocBaDienTu', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL15.DVTINH99\MSSQL\DATA\HocBaDienTu.mdf' , SIZE = 73728KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'HocBaDienTu_log', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL15.DVTINH99\MSSQL\DATA\HocBaDienTu_log.ldf' , SIZE = 73728KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [HocBaDienTu] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HocBaDienTu].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HocBaDienTu] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [HocBaDienTu] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [HocBaDienTu] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [HocBaDienTu] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [HocBaDienTu] SET ARITHABORT OFF 
GO
ALTER DATABASE [HocBaDienTu] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [HocBaDienTu] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [HocBaDienTu] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [HocBaDienTu] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [HocBaDienTu] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [HocBaDienTu] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [HocBaDienTu] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [HocBaDienTu] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [HocBaDienTu] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [HocBaDienTu] SET  DISABLE_BROKER 
GO
ALTER DATABASE [HocBaDienTu] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [HocBaDienTu] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [HocBaDienTu] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [HocBaDienTu] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [HocBaDienTu] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [HocBaDienTu] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [HocBaDienTu] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [HocBaDienTu] SET RECOVERY FULL 
GO
ALTER DATABASE [HocBaDienTu] SET  MULTI_USER 
GO
ALTER DATABASE [HocBaDienTu] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [HocBaDienTu] SET DB_CHAINING OFF 
GO
ALTER DATABASE [HocBaDienTu] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [HocBaDienTu] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [HocBaDienTu] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [HocBaDienTu] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'HocBaDienTu', N'ON'
GO
ALTER DATABASE [HocBaDienTu] SET QUERY_STORE = OFF
GO
USE [HocBaDienTu]
GO
/****** Object:  DatabaseRole [MSmerge_PAL_role]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE ROLE [MSmerge_PAL_role]
GO
/****** Object:  DatabaseRole [MSmerge_C058CCB4DECE41ECAC4C0C756930E443]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE ROLE [MSmerge_C058CCB4DECE41ECAC4C0C756930E443]
GO
ALTER ROLE [MSmerge_PAL_role] ADD MEMBER [MSmerge_C058CCB4DECE41ECAC4C0C756930E443]
GO
/****** Object:  Schema [MSmerge_PAL_role]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE SCHEMA [MSmerge_PAL_role]
GO
/****** Object:  Table [dbo].[Cap]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cap](
	[Ma_cap] [int] NOT NULL,
	[Ten_cap] [varchar](255) NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_cap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Diem]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Diem](
	[Ma_Diem] [int] NOT NULL,
	[Ma_hs] [int] NULL,
	[Ma_PC] [int] NULL,
	[Ma_Mon] [int] NULL,
	[Diem] [varchar](50) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_Diem] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Giao_vien]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Giao_vien](
	[Ma_gv] [int] NOT NULL,
	[Ma_school] [int] NULL,
	[Ho] [varchar](50) NULL,
	[Ten] [varchar](50) NULL,
	[Gioi_Tinh] [varchar](50) NULL,
	[Ngay_Sinh] [varchar](50) NULL,
	[Dia_Chi] [varchar](50) NULL,
	[Sdt] [varchar](50) NULL,
	[CMND] [varchar](50) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_gv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hoc_sinh]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoc_sinh](
	[Ma_hs] [int] NOT NULL,
	[Ma_school] [int] NULL,
	[Ho] [varchar](50) NULL,
	[Ten] [varchar](50) NULL,
	[Gioi_Tinh] [varchar](50) NULL,
	[Ngay_Sinh] [varchar](50) NULL,
	[Dia_Chi] [varchar](50) NULL,
	[Sdt] [varchar](50) NULL,
	[CMND] [varchar](50) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_hs] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HocKy]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HocKy](
	[Ma_hk] [int] NOT NULL,
	[Ma_namhoc] [int] NULL,
	[Ten_hk] [varchar](50) NULL,
	[Ngay_batdau] [datetime] NULL,
	[Ngay_ketthuc] [datetime] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_hk] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khoi_Hoc]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khoi_Hoc](
	[MaKH] [int] NOT NULL,
	[TenKH] [varchar](50) NULL,
	[Ma_school] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Lop_Hoc]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Lop_Hoc](
	[Ma_class] [int] NOT NULL,
	[Ma_KH] [int] NULL,
	[Ma_namhoc] [int] NULL,
	[Ma_gvcn] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_class] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Mon_Hoc]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Mon_Hoc](
	[Ma_Mon] [int] NOT NULL,
	[Ten_Mon] [nvarchar](50) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	[Ma_Cap] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_Mon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Nam_Hoc]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nam_Hoc](
	[Ma_namhoc] [int] NOT NULL,
	[Ma_school] [int] NULL,
	[Ten_namhoc] [varchar](50) NULL,
	[Nam_batdau] [varchar](50) NULL,
	[Nam_ketthuc] [varchar](50) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_namhoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phan_Cong]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phan_Cong](
	[Ma_PC] [int] NOT NULL,
	[Ma_GV] [int] NULL,
	[Ma_class] [int] NULL,
	[Ma_HK] [int] NULL,
	[Ma_Mon] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_PC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Truong_Hoc]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Truong_Hoc](
	[Ma_school] [int] NOT NULL,
	[Ten_truong] [varchar](255) NOT NULL,
	[Dia_chi] [varchar](255) NULL,
	[Ma_cap] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma_school] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Xep_loai]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Xep_loai](
	[Ma_hs] [int] NULL,
	[Ma_hk] [int] NULL,
	[TB_Mon] [real] NULL,
	[Hoc_luc] [varchar](50) NULL,
	[Hanh_kiem] [varchar](50) NULL,
	[Xet_len_lop] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Xep_lop]    Script Date: 3/25/2021 11:27:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Xep_lop](
	[Ma_hs] [int] NULL,
	[Ma_class] [int] NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Cap] ([Ma_cap], [Ten_cap], [rowguid]) VALUES (1, N'cap 1', N'08b33e4d-848d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Cap] ([Ma_cap], [Ten_cap], [rowguid]) VALUES (2, N'cap 2', N'09b33e4d-848d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Cap] ([Ma_cap], [Ten_cap], [rowguid]) VALUES (3, N'cap 3', N'0ab33e4d-848d-eb11-8c13-aced5cbe93ca')
GO
INSERT [dbo].[Giao_vien] ([Ma_gv], [Ma_school], [Ho], [Ten], [Gioi_Tinh], [Ngay_Sinh], [Dia_Chi], [Sdt], [CMND], [rowguid]) VALUES (1, 1, N'nguyen', N'Hien', N'Nu', N'20/11/1999', N'Tam ki', N'0965893632', N'206314724', N'8ddb5120-868d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Giao_vien] ([Ma_gv], [Ma_school], [Ho], [Ten], [Gioi_Tinh], [Ngay_Sinh], [Dia_Chi], [Sdt], [CMND], [rowguid]) VALUES (2, 2, N'tran', N'Hoan', N'Nam', N'20/11/1998', N'tam ki', N'0965893633', N'206314725', N'57730338-868d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Giao_vien] ([Ma_gv], [Ma_school], [Ho], [Ten], [Gioi_Tinh], [Ngay_Sinh], [Dia_Chi], [Sdt], [CMND], [rowguid]) VALUES (3, 3, N'Dinh', N'Diem', N'Nu', N'20/11/1997', N'tam ki', N'0965893634', N'206314726', N'f6eb6847-868d-eb11-8c13-aced5cbe93ca')
GO
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (1, N'Toan Cap 1', N'f3114cd5-4d8d-eb11-8c11-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (2, N'Van', N'e4ec97b2-838d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (3, N'Tu nhien va xa hoi', N'bc415496-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (4, N'Khoa hoc', N'b8c9f29e-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (5, N'Lich su', N'b9c9f29e-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (6, N'Dia li', N'6d4921a6-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (7, N'Am nhac', N'f99fa9af-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (8, N'My thuat', N'fa9fa9af-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (9, N'Dao duc', N'10c587ca-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (10, N'The Duc', N'11c587ca-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (11, N'Tin hoc', N'092f54d5-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (12, N'Tieng Anh', N'0a2f54d5-848d-eb11-8c13-aced5cbe93ca', 1)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (13, N'Toan', N'b00830e0-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (14, N'Li', N'b10830e0-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (15, N'Hoa', N'b20830e0-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (16, N'Sinh Hoc', N'b506d5ea-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (17, N'Cong Nghe', N'b606d5ea-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (18, N'Van', N'ef1b1af1-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (19, N'Su', N'f01b1af1-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (20, N'Dia Li', N'9e3795f7-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (21, N'GDCD', N'0986d8fd-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (22, N'Ngoai Ngu', N'0a86d8fd-848d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (23, N'The Duc', N'a9a30108-858d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (24, N'Am nhac', N'aaa30108-858d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (25, N'My thuat', N'f5e9bb0f-858d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (26, N'Tin Hoc', N'436f5517-858d-eb11-8c13-aced5cbe93ca', 2)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (27, N'Toan', N'ff8da82e-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (28, N'Li', N'008ea82e-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (29, N'Hoa', N'f446aa36-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (30, N'Sinh', N'f546aa36-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (31, N'Cong Nghe', N'41a7773f-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (32, N'Van', N'42a7773f-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (33, N'Lich Su', N'aa3afb47-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (34, N'Dia Li', N'ab3afb47-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (35, N'GDCD', N'32894e50-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (36, N'Ngoai Ngu', N'33894e50-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (37, N'The Duc', N'e690285a-858d-eb11-8c13-aced5cbe93ca', 3)
INSERT [dbo].[Mon_Hoc] ([Ma_Mon], [Ten_Mon], [rowguid], [Ma_Cap]) VALUES (38, N'Tin Hoc', N'e790285a-858d-eb11-8c13-aced5cbe93ca', 3)
GO
INSERT [dbo].[Truong_Hoc] ([Ma_school], [Ten_truong], [Dia_chi], [Ma_cap], [rowguid]) VALUES (1, N'Nguyen Van Troi', N'Tam Ki', 1, N'33d1867b-858d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Truong_Hoc] ([Ma_school], [Ten_truong], [Dia_chi], [Ma_cap], [rowguid]) VALUES (2, N'Nguyen Du', N'Tam Ki', 2, N'effefa81-858d-eb11-8c13-aced5cbe93ca')
INSERT [dbo].[Truong_Hoc] ([Ma_school], [Ten_truong], [Dia_chi], [Ma_cap], [rowguid]) VALUES (3, N'Tran Cao Van', N'tam ki', 3, N'e8036a88-858d-eb11-8c13-aced5cbe93ca')
GO
/****** Object:  Index [MSmerge_index_581577110]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_581577110] ON [dbo].[Cap]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_1125579048]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_1125579048] ON [dbo].[Diem]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_693577509]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_693577509] ON [dbo].[Giao_vien]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_645577338]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_645577338] ON [dbo].[Hoc_sinh]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_837578022]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_837578022] ON [dbo].[HocKy]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_741577680]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_741577680] ON [dbo].[Khoi_Hoc]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_917578307]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_917578307] ON [dbo].[Lop_Hoc]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_885578193]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_885578193] ON [dbo].[Mon_Hoc]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_789577851]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_789577851] ON [dbo].[Nam_Hoc]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_997578592]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_997578592] ON [dbo].[Phan_Cong]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_613577224]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_613577224] ON [dbo].[Truong_Hoc]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_1397580017]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_1397580017] ON [dbo].[Xep_loai]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [MSmerge_index_1077578877]    Script Date: 3/25/2021 11:27:42 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [MSmerge_index_1077578877] ON [dbo].[Xep_lop]
(
	[rowguid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Cap] ADD  CONSTRAINT [MSmerge_df_rowguid_400413DCE5C74BFB8431B3E1446CCF74]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Diem] ADD  CONSTRAINT [MSmerge_df_rowguid_11B46F1D6F5548198FC752D9D2401DD7]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Giao_vien] ADD  CONSTRAINT [MSmerge_df_rowguid_3A195D374B4B4BFCB8D8FC12A7BF0C80]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Hoc_sinh] ADD  CONSTRAINT [MSmerge_df_rowguid_48BC62E69B6A43A69AFBAD6E83838087]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[HocKy] ADD  CONSTRAINT [MSmerge_df_rowguid_D1308E48CFD446DBA41FEB1C44D2F8CA]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Khoi_Hoc] ADD  CONSTRAINT [MSmerge_df_rowguid_93E2B7587789419C8ABF2BC9D47E6340]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Lop_Hoc] ADD  CONSTRAINT [MSmerge_df_rowguid_F2D08535642F4F2494539C340209206D]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Mon_Hoc] ADD  CONSTRAINT [MSmerge_df_rowguid_16771D5AE2DA4CA8BB9A348A5E6F9AA5]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Nam_Hoc] ADD  CONSTRAINT [MSmerge_df_rowguid_CBDFE2283769493B82A25604A2B0EBA3]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Phan_Cong] ADD  CONSTRAINT [MSmerge_df_rowguid_D7BB4FD0FDDA4C7693D9FBE2FC8521D7]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Truong_Hoc] ADD  CONSTRAINT [MSmerge_df_rowguid_1F8B362F7E7D44D0BB04C24AC4100FB4]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Xep_loai] ADD  CONSTRAINT [MSmerge_df_rowguid_61B70E2AC8224D1D91CC3C90322B71B1]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Xep_lop] ADD  CONSTRAINT [MSmerge_df_rowguid_1F0F04602F744D57BD1C1B3CABC84A3B]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[Diem]  WITH CHECK ADD FOREIGN KEY([Ma_hs])
REFERENCES [dbo].[Hoc_sinh] ([Ma_hs])
GO
ALTER TABLE [dbo].[Diem]  WITH CHECK ADD FOREIGN KEY([Ma_Mon])
REFERENCES [dbo].[Mon_Hoc] ([Ma_Mon])
GO
ALTER TABLE [dbo].[Diem]  WITH CHECK ADD FOREIGN KEY([Ma_PC])
REFERENCES [dbo].[Phan_Cong] ([Ma_PC])
GO
ALTER TABLE [dbo].[Giao_vien]  WITH CHECK ADD FOREIGN KEY([Ma_school])
REFERENCES [dbo].[Truong_Hoc] ([Ma_school])
GO
ALTER TABLE [dbo].[Hoc_sinh]  WITH CHECK ADD FOREIGN KEY([Ma_school])
REFERENCES [dbo].[Truong_Hoc] ([Ma_school])
GO
ALTER TABLE [dbo].[HocKy]  WITH CHECK ADD FOREIGN KEY([Ma_namhoc])
REFERENCES [dbo].[Nam_Hoc] ([Ma_namhoc])
GO
ALTER TABLE [dbo].[Khoi_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_school])
REFERENCES [dbo].[Truong_Hoc] ([Ma_school])
GO
ALTER TABLE [dbo].[Lop_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_gvcn])
REFERENCES [dbo].[Giao_vien] ([Ma_gv])
GO
ALTER TABLE [dbo].[Lop_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_KH])
REFERENCES [dbo].[Khoi_Hoc] ([MaKH])
GO
ALTER TABLE [dbo].[Lop_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_namhoc])
REFERENCES [dbo].[Nam_Hoc] ([Ma_namhoc])
GO
ALTER TABLE [dbo].[Mon_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_Cap])
REFERENCES [dbo].[Cap] ([Ma_cap])
GO
ALTER TABLE [dbo].[Nam_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_school])
REFERENCES [dbo].[Truong_Hoc] ([Ma_school])
GO
ALTER TABLE [dbo].[Phan_Cong]  WITH CHECK ADD FOREIGN KEY([Ma_class])
REFERENCES [dbo].[Lop_Hoc] ([Ma_class])
GO
ALTER TABLE [dbo].[Phan_Cong]  WITH CHECK ADD FOREIGN KEY([Ma_GV])
REFERENCES [dbo].[Giao_vien] ([Ma_gv])
GO
ALTER TABLE [dbo].[Phan_Cong]  WITH CHECK ADD FOREIGN KEY([Ma_HK])
REFERENCES [dbo].[HocKy] ([Ma_hk])
GO
ALTER TABLE [dbo].[Truong_Hoc]  WITH CHECK ADD FOREIGN KEY([Ma_cap])
REFERENCES [dbo].[Cap] ([Ma_cap])
GO
ALTER TABLE [dbo].[Xep_loai]  WITH CHECK ADD FOREIGN KEY([Ma_hk])
REFERENCES [dbo].[HocKy] ([Ma_hk])
GO
ALTER TABLE [dbo].[Xep_loai]  WITH CHECK ADD FOREIGN KEY([Ma_hs])
REFERENCES [dbo].[Hoc_sinh] ([Ma_hs])
GO
ALTER TABLE [dbo].[Xep_lop]  WITH CHECK ADD FOREIGN KEY([Ma_class])
REFERENCES [dbo].[Lop_Hoc] ([Ma_class])
GO
ALTER TABLE [dbo].[Xep_lop]  WITH CHECK ADD FOREIGN KEY([Ma_hs])
REFERENCES [dbo].[Hoc_sinh] ([Ma_hs])
GO
USE [master]
GO
ALTER DATABASE [HocBaDienTu] SET  READ_WRITE 
GO
