USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_CommitmentAllocation]    Script Date: 25/01/2018 4:59:17 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_CommitmentAllocation](
	[ASOFDATE] [datetime] NULL,
	[AssetCode] [nvarchar](255) NULL,
	[DTDATE] [datetime] NULL,
	[COMMITMENTS] [float] NULL,
	[ALLOCATION] [float] NULL,
	[currentAllocation] [float] NULL,
	[currentCommitment] [float] NULL,
	[iLevel] [nvarchar](255) NULL
) ON [PRIMARY]
GO

