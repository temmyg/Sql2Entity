USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_AssetValuationEffDate]    Script Date: 25/01/2018 4:58:54 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_AssetValuationEffDate](
	[AsOfDate] [datetime] NULL,
	[assetCode] [nvarchar](255) NULL,
	[ValuationEffDate] [datetime] NULL
) ON [PRIMARY]
GO

