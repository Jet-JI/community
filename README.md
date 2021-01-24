## 码匠社区

##资料
[Spring 文档](https://spring.io/guides)
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[Github OAuth](https://docs.github.com/en/free-pro-team@latest/developers/apps/creating-an-oauth-app)
##工具
[git 工具](https://git-scm.com/download)

##脚本
```sql
-- we don't know how to generate root <with-no-name> (class Root) :(
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);


```