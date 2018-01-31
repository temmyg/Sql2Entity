USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_Ownership]    Script Date: 25/01/2018 5:00:31 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_Ownership](
	[AsofDate] [datetime] NULL,
	[AssetCode] [nvarchar](255) NULL,
	[OwnershipDate] [datetime] NULL,
	[CPPIBOwnershipPerc] [float] NULL,
	[iLevel] [nvarchar](255) NULL
) ON [PRIMARY]
GO

