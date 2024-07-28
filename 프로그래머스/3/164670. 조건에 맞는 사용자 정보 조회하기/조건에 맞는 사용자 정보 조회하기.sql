-- 코드를 입력하세요
select user_id, nickname, city || ' ' || street_address1 || ' '|| street_address2 전체주소,
    regexp_replace(tlno, '(.{3})(.+)(.{4})', '\1-\2-\3') 전화번호
from used_goods_user ugu,
    (SELECT writer_id, count(*)
    from used_goods_board
    group by writer_id
    having count(*) >= 3) ugb
where 
    ugu.user_id = ugb.writer_id
order by user_id desc
