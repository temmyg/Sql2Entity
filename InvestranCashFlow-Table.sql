USE [IFRDH]
GO

/****** Object:  Table [dbo].[InvestranCashFlow]    Script Date: 23/01/2018 11:43:46 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[InvestranCashFlow](
	[Deal_ID] [varchar](50) NULL,
	[Legal_Entity] [varchar](50) NULL,
	[Model_Portfolio] [varchar](50) NULL,
	[SCD_ID] [varchar](50) NULL,
	[Investment_Taxonomy] [varchar](50) NULL,
	[Investment_Structure_1] [varchar](50) NULL,
	[Investment_Structure_2] [varchar](50) NULL,
	[Investment_Structure_3] [varchar](50) NULL,
	[Investment_Structure_4] [varchar](50) NULL,
	[Investment_Structure_5] [varchar](50) NULL,
	[Investment_Structure_6] [varchar](50) NULL,
	[Family] [varchar](50) NULL,
	[Reporting_Name] [varchar](50) NULL,
	[Deal_Name] [varchar](50) NULL,
	[Deal_Currency] [varchar](50) NULL,
	[Deal_Commitment] [varchar](50) NULL,
	[Primary_Investment_Category] [varchar](50) NULL,
	[Developed_or_Emerging_Markets] [varchar](50) NULL,
	[Financial_Statement_Classification] [varchar](50) NULL,
	[Active_or_Liquidated] [varchar](50) NULL,
	[Liquidation_Date] [varchar](50) NULL,
	[Risk_Rating] [varchar](50) NULL,
	[CPP_Closing_Date] [varchar](50) NULL,
	[Board_Seat_Count] [varchar](50) NULL,
	[Follow_On] [varchar](50) NULL,
	[Primary_FO] [varchar](50) NULL,
	[Secondary_FO] [varchar](50) NULL,
	[Industry_Focus] [varchar](50) NULL,
	[Geographic_Focus] [varchar](50) NULL,
	[Vintage_Year] [varchar](50) NULL,
	[Investing_Entity] [varchar](50) NULL,
	[Primary_PI] [varchar](50) NULL,
	[Stock_Distribution] [varchar](50) NULL,
	[Equity_ownership_Perc] [varchar](50) NULL,
	[CPPIB_CC_rating] [varchar](50) NULL,
	[Adjusted_Beta] [varchar](50) NULL,
	[PCI_Strategy] [varchar](50) NULL
) ON [PRIMARY]
GO


