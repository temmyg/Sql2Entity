USE [IFRDH]
GO

/****** Object:  Table [dbo].[NormTables]    Script Date: 31/01/2018 2:23:21 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[NormTables](
	[TableName] [nvarchar](255) NOT NULL,
	[OrderedId] [int] NOT NULL,
	[IsNormalizing] [bit] NULL,
 CONSTRAINT [PK_NormTables_1] PRIMARY KEY CLUSTERED 
(
	[TableName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

