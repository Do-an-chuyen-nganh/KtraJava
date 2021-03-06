USE [QLAccount]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 04/13/2021 19:39:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[AccountNo] [nvarchar](10) NOT NULL,
	[AccountName] [nvarchar](50) NULL,
	[Address] [nvarchar](255) NULL,
	[Amount] [decimal](18, 0) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[AccountNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([AccountNo], [AccountName], [Address], [Amount]) VALUES (N'210121121', N'Nguyen Van A', N'TP HCM', CAST(3000 AS Decimal(18, 0)))
INSERT [dbo].[Account] ([AccountNo], [AccountName], [Address], [Amount]) VALUES (N'213232574', N'Nguyen Van B', N'Binh Duong', CAST(4000 AS Decimal(18, 0)))
INSERT [dbo].[Account] ([AccountNo], [AccountName], [Address], [Amount]) VALUES (N'214454644', N'Nguyen Van C', N'Dong Nai', CAST(5000 AS Decimal(18, 0)))
