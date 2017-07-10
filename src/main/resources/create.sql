create table account
(
	id int not null auto_increment
		primary key,
	name varchar(50) not null
);
INSERT INTO account (name) VALUES ('admin');