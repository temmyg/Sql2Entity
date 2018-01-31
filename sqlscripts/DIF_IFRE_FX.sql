USE [Wellness]
GO

/****** Object:  Table [dbo].[DIF_IFRE_FX]    Script Date: 25/01/2018 5:00:02 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DIF_IFRE_FX](
	[AsofDate] [datetime] NULL,
	[Currency] [nvarchar](255) NULL,
	[Rate] [float] NULL
) ON [PRIMARY]
GO

