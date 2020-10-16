select * from DEPT;
select * from tab;

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

select * from dept where deptno=90;
	
--90번 부서의 지역을 독도로 수정
update dept set loc='독도'
	where deptno=90;
	
--90번 부서 지역을 삭제
delete from dept
	where deptno=90;
