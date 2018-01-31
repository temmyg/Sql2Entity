USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_AssetPredMaturityDate]    Script Date: 25/01/2018 4:58:33 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_AssetPredMaturityDate](
	[AsOfDate] [datetime] NULL,
	[assetCode] [nvarchar](255) NULL,
	[PredMaturityDate] [nvarchar](255) NULL
) ON [PRIMARY]
GO

