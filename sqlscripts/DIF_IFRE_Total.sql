USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_Total]    Script Date: 25/01/2018 5:00:47 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_Total](
	[AsOfDate] [datetime] NULL,
	[dtdate] [datetime] NULL,
	[AssetCode] [nvarchar](255) NULL,
	[DeferredTaxLiability] [float] NULL,
	[DeferredTaxExpense] [float] NULL,
	[AssetPrice] [float] NULL,
	[DebtPrice] [float] NULL,
	[ilevel] [nvarchar](255) NULL,
	[AssetManagementFeesAccountTreeAcc] [float] NULL,
	[AssetManagementFeesAccountTreeCdn] [float] NULL,
	[AssetValuationAccountTreeAcc] [float] NULL,
	[AssetValuationAccountTreeCdn] [float] NULL,
	[DebtValuationAccountTreeAcc] [float] NULL,
	[DebtValuationAccountTreeCdn] [float] NULL,
	[InterestExpenseAccountTreeAcc] [float] NULL,
	[InterestExpenseAccountTreeCdn] [float] NULL,
	[NetInvestmentIncomeAccountTreeALAcc] [float] NULL,
	[NetInvestmentIncomeAccountTreeALCdn] [float] NULL,
	[NetInvestmentIncomeAccountTreeILAcc] [float] NULL,
	[NetInvestmentIncomeAccountTreeILCdn] [float] NULL,
	[NetOperatingIncomeAccountTreeAcc] [float] NULL,
	[NetOperatingIncomeAccountTreeCdn] [float] NULL,
	[NetRealizedCapitalGainLossAccountTreeAcc] [float] NULL,
	[NetRealizedCapitalGainLossAccountTreeCdn] [float] NULL,
	[OtherInvestmentExpensesAccountTreeAcc] [float] NULL,
	[OtherInvestmentExpensesAccountTreeCdn] [float] NULL,
	[PerformanceFeesAccountTreeAcc] [float] NULL,
	[PerformanceFeesAccountTreeCdn] [float] NULL,
	[REIGrossRealizedIncomeAccountTreeAcc] [float] NULL,
	[REIGrossRealizedIncomeAccountTreeCdn] [float] NULL,
	[REINetRealizedIncomeAccountTreeALAcc] [float] NULL,
	[REINetRealizedIncomeAccountTreeALCdn] [float] NULL,
	[REINetRealizedIncomeAccountTreeILAcc] [float] NULL,
	[REINetRealizedIncomeAccountTreeILCdn] [float] NULL,
	[REIUnrealizedIncomeAccountTreeAcc] [float] NULL,
	[REIUnrealizedIncomeAccountTreeCdn] [float] NULL,
	[TransactionCostsAccountTreeAcc] [float] NULL,
	[TransactionCostsAccountTreeCdn] [float] NULL,
	[UndistributedIncomeAccountTreeAcc] [float] NULL,
	[UndistributedIncomeAccountTreeCdn] [float] NULL,
	[UnrealizedFXGainLossAccountTreeAcc] [float] NULL,
	[UnrealizedFXGainLossAccountTreeCdn] [float] NULL,
	[REIGrossRealizedIncomeAccountTreeALAcc] [float] NULL,
	[REIGrossRealizedIncomeAccountTreeALCdn] [float] NULL,
	[NetSalesProceedsCdn] [float] NULL,
	[NetSalesProceedsAcc] [float] NULL,
	[NetSalesProceedsCdnTotal] [float] NULL,
	[NetSalesProceedsAccTotal] [float] NULL,
	[CashDistributionsFromOperationsCdn] [float] NULL,
	[CashDistributionsFromOperationsAcc] [float] NULL,
	[DistributableIncomeAcc] [float] NULL,
	[DistributableIncomeCdn] [float] NULL
) ON [PRIMARY]
GO

