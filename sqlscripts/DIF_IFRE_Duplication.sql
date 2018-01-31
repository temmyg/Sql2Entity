USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_Duplication]    Script Date: 25/01/2018 4:59:53 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_Duplication](
	[AsOfDate] [datetime] NULL,
	[AssetCode] [nvarchar](255) NULL,
	[myCount] [nvarchar](255) NULL,
	[TableName] [nvarchar](255) NULL,
	[iLevel] [nvarchar](255) NULL
) ON [PRIMARY]
GO

