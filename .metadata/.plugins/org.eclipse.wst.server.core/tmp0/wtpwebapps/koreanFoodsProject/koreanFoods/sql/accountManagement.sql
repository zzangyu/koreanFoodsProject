create table Membership (
	kfoods_id varchar2(30) unique,
	kfoods_pw1 varchar2(30),
	kfoods_pw2 varchar2(30),
	kfoods_email varchar2(30) unique,
	kfoods_nick varchar2(30) unique
)

select * from MEMBERSHIP;
select kfoods_id from Membership where kfoods_id = 'hanchangyu';