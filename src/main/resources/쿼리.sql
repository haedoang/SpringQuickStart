-- 실습 테이블 생성하기 

create table users(
    id varchar2(8) primary key,
    password varchar2(8),
    name varchar2(20),
    role varchar2(5)
);
insert into users values('test','test123','관리자','Admin');
insert into users values('user1','user1','홍길동','User');


create table board(
    seq number(5) primary key,
    title varchar2(200),
    writer varchar2(20),
    content varchar2(2000),
    regdate date default sysdate,
    cnt number(5) default 0
);

insert into board(seq,title,writer,content) values(1,'기업인사','관리자','잘 부탁드립니다..');


select * from users;

commit;

select * from users
 where id='test' and password='test123';
