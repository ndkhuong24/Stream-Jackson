USE [master]
GO
CREATE DATABASE [SOF306_L1_AdvEx]
GO
CREATE TABLE [People](
	Id UNIQUEIDENTIFIER,
	first_name nvarchar(100),
	last_name nvarchar(100),
	email nvarchar(100),
	gender nvarchar(100),
	ip_address nvarchar(100),
	avatar nvarchar(100),
	country nvarchar(100),
	job nvarchar(100),
	company nvarchar(100),
	salary nvarchar(100),
	username nvarchar(100),
	password nvarchar(100),
	slogan nvarchar(100),
)