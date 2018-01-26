USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_AssetDebtMaturityDate]    Script Date: 25/01/2018 4:58:22 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_AssetDebtMaturityDate](
	[AsOfDate] [datetime] NULL,
	[assetCode] [nvarchar](255) NULL,
	[DebtMaturityDate] [datetime] NULL
) ON [PRIMARY]
GO

