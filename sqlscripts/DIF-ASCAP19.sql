USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_ASCAP19]    Script Date: 25/01/2018 4:56:54 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_ASCAP19](
	[assetCode] [nvarchar](255) NULL,
	[AsOfDate] [datetime] NULL,
	[NOI] [float] NULL,
	[UNDINC] [float] NULL,
	[DTEXP] [float] NULL,
	[GNLOSS] [float] NULL,
	[TRANEXP] [float] NULL,
	[NI] [float] NULL,
	[INVEXP] [float] NULL,
	[CAPVAL] [float] NULL,
	[DTVAL] [float] NULL,
	[DTFX] [float] NULL,
	[ASFX] [float] NULL,
	[MTD_Capital_Return] [float] NULL,
	[MTD_Capital_Return_Unl] [float] NULL,
	[MTD_FX_Return] [float] NULL,
	[MTD_FX_Return_Unl] [float] NULL,
	[MTD_Income_Return] [float] NULL,
	[MTD_Income_Return_Unl] [float] NULL,
	[MTD_Total_Return] [float] NULL,
	[MTD_Total_Return_Unl] [float] NULL,
	[INCTAX] [float] NULL,
	[QTD_CAPITAL_RETURN] [float] NULL,
	[YTD_CAPITAL_RETURN] [float] NULL,
	[QTD_CAPITAL_RETURN_UNL] [float] NULL,
	[YTD_CAPITAL_RETURN_UNL] [float] NULL,
	[QTD_FX_RETURN] [float] NULL,
	[YTD_FX_RETURN] [float] NULL,
	[QTD_FX_RETURN_UNL] [float] NULL,
	[YTD_FX_RETURN_UNL] [float] NULL,
	[QTD_INCOME_RETURN] [float] NULL,
	[YTD_INCOME_RETURN] [float] NULL,
	[QTD_INCOME_RETURN_UNL] [float] NULL,
	[YTD_INCOME_RETURN_UNL] [float] NULL
) ON [PRIMARY]
GO

