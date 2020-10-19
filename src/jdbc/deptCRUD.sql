select * from DEPT;
select * from tab;

*table 문법
create table 테이블명(
컬럼명 데이터타입(크기),
컬럼명 데이터타입(크기) constraint 제약조건명 제약조건
컬럼명 데이터타입(크기) constraint 제약조건명 제약조건 default 기본값,
);


*delete 문법
delete from tablename 
	[where 조건];

*update 문법
update tablename set column = ''
	[where 조건];

*insert 문법
insert into tablename values('','','');

*select 문법
select columnname from tablename
	[where 조건]
	[group by 그룹기준]
	[having 그룹조건]
	[order by 정렬기준 정렬방식]
정렬방식
-오름차순(기본, asc) : 숫자-12345, 문자-abcdef, 예전->최근
-내림차순(desc)

--DEPT 테이블에 90, IT, 서울 입력
insert into dept values(90,'IT','서울');
select * from dept;

--sequence 생성
create sequence 시퀀스명
start with 시작값
increment by 증감값
maxvalue 최대값
minvalue 최소값
cycle | nocycle;

create sequence eno_seq
start with 8000
increment by 1
maxvalue 9999
nocycle;

--sequence 사용 : 시퀀스명.nextval
insert into emp(empno, ename, sal, hiredate)
values(eno_seq.nextval, '민1', 3000, sysdate);

update emp set sal=sal+100
where empno=8000;

select empno, ename, sal, hiredate from emp
where empno>=7900 order by empno desc;

select * from dept;


select * from dept where deptno=90;
	
--90번 부서의 지역을 독도로 수정
update dept set loc='독도'
	where deptno=90;
	
--90번 부서 지역을 삭제
delete from dept
	where deptno=90;
