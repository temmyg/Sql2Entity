USE [IFRDH]
GO

/****** Object:  Table [dbo].[NormalizationTablesSpec]    Script Date: 31/01/2018 2:23:39 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[NormalizationTablesSpec](
	[ColumnName] [nvarchar](255) NULL,
	[OriginalTable] [nvarchar](255) NOT NULL,
	[DataType] [nvarchar](255) NULL,
	[Id] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_NormalizationTablesSpec] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[NormalizationTablesSpec]  WITH CHECK ADD  CONSTRAINT [FK_NormalizationTablesSpec_NormTables] FOREIGN KEY([OriginalTable])
REFERENCES [dbo].[NormTables] ([TableName])
GO

ALTER TABLE [dbo].[NormalizationTablesSpec] CHECK CONSTRAINT [FK_NormalizationTablesSpec_NormTables]
GO

