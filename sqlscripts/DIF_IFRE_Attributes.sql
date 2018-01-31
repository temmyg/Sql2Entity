USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_Attributes]    Script Date: 25/01/2018 4:59:05 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_Attributes](
	[AsOfDate] [datetime] NULL,
	[YardiAttribute] [nvarchar](255) NULL,
	[YardiAttributeName] [nvarchar](255) NULL,
	[PermissibleValues] [nvarchar](255) NULL
) ON [PRIMARY]
GO

