create table 테이블명(
컬럼명 데이터타입(크기),
컬럼명 데이터타입(크기) constraint 제약조건명 제약조건
컬럼명 데이터타입(크기) constraint 제약조건명 제약조건 default 기본값,
);
--회원 테이블 삭제(있을수 있으니까)
drop table member;

--회원 테이블 생성 : 회원번호, 이름, id, 비번, 회원가입일
create table member(
	mno number(5) constraint member_mno_p primary key,
	mname varchar2(30),
	mid varchar2(20),
	mpw varchar2(20),
	mdate date default sysdate
);

select mno, mname, mid, mpw, mdate from member;

insert into member 
	values(eno_seq.nextval,'민1','min1','1234',sysdate);
insert into member 
	values(eno_seq.nextval,'민2','min2','asdf',sysdate);
insert into member 
	values(eno_seq.nextval,'민3','min3','zxcv',sysdate);

update member set mname='민new1', mpw='4321'
	where mno=8002;

delete from member
	where mno=8002;




