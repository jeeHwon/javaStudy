create table company(
cno number constraint company_cno_nn not null,
cname varchar2(30) constraint company_cname_nn not null,
ceo varchar2(30),
tel varchar2(20),
dam varchar2(30),
constraint company_cno_p primary key(cno)
);


insert into company values(111, '구글', '지승원', '11', '아이유');