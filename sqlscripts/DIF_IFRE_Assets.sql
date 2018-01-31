USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_Assets]    Script Date: 25/01/2018 4:58:43 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_Assets](
	[AsOfDate] [datetime] NULL,
	[AssetCode] [nvarchar](255) NULL,
	[FinalApprovalDate] [datetime] NULL,
	[CppibCloseDate] [datetime] NULL,
	[FirstFundingDate] [datetime] NULL,
	[CommitmentStartDate] [datetime] NULL,
	[OwnershipDate] [datetime] NULL,
	[DispositionDate] [datetime] NULL,
	[PartnerYearEndDate] [nvarchar](255) NULL,
	[ActualConstDate] [datetime] NULL,
	[ProjConstCompletionDate] [datetime] NULL,
	[ReforecastConstCompletionDate] [datetime] NULL,
	[ProjStabDate] [datetime] NULL,
	[ReforecastStabDate] [datetime] NULL,
	[ActualConstCompletionDate] [datetime] NULL,
	[ActualStabDate] [datetime] NULL,
	[DebtCarryingValue] [float] NULL,
	[AssetCarryingValue] [float] NULL,
	[iLevel] [nvarchar](255) NULL,
	[InvestmentTypeIL] [nvarchar](255) NULL,
	[InvestmentTypeAL] [nvarchar](255) NULL,
	[AssetCount] [nvarchar](255) NULL,
	[InvestmentCount] [nvarchar](255) NULL,
	[InvestmentStageAL] [nvarchar](255) NULL,
	[MarketType] [nvarchar](255) NULL,
	[REIAllocationAL] [nvarchar](255) NULL,
	[REIAllocationIL] [nvarchar](255) NULL,
	[RAHierarchy] [nvarchar](255) NULL,
	[EntitySelectionCode] [nvarchar](255) NULL,
	[EmergingMarketIL] [nvarchar](255) NULL,
	[EmergingMarketAL] [nvarchar](255) NULL,
	[FundingBucketIL] [nvarchar](255) NULL,
	[ProgramAssignmentIL] [nvarchar](255) NULL,
	[CPPIBInvestmentEntity] [nvarchar](255) NULL,
	[CountryRegionIL] [nvarchar](255) NULL,
	[CountryRegionAL] [nvarchar](255) NULL,
	[CountryExposureIL] [nvarchar](255) NULL,
	[CurrencyExposureIL] [nvarchar](255) NULL,
	[LegalEntityCurr] [nvarchar](255) NULL,
	[OwnershipTableCurr] [nvarchar](255) NULL,
	[InvestmentManagerIL] [nvarchar](255) NULL,
	[InvestmentManagerAL] [nvarchar](255) NULL,
	[ReportingClassIL] [nvarchar](255) NULL,
	[FVHierarchyIL] [nvarchar](255) NULL,
	[InvestmentCountIL] [nvarchar](255) NULL,
	[PerformanceBenchmarkIL] [nvarchar](255) NULL,
	[PartnerIL] [nvarchar](255) NULL,
	[PartnerOwnershipIL] [nvarchar](255) NULL,
	[ReportingCurrencyAL] [nvarchar](255) NULL,
	[ReportingCurrencyIL] [nvarchar](255) NULL,
	[TargetUnleveredIRRIL] [float] NULL,
	[TargetLeveredIRRIL] [float] NULL,
	[OwnedGrossLeasableArea] [float] NULL,
	[OwnedOccupiedArea] [float] NULL,
	[TotalActualDevelopmentCosts] [float] NULL,
	[OTHERPARTNER2OWNERSHIP] [float] NULL,
	[OTHERPARTNER3OWNERSHIP] [float] NULL,
	[ManagerOwnership] [float] NULL,
	[SectorIL] [nvarchar](255) NULL,
	[InvestmentName] [nvarchar](255) NULL,
	[DateLastRenovated] [datetime] NULL,
	[DevelopmentYield] [nvarchar](255) NULL
) ON [PRIMARY]
GO

