-- 코드를 입력하세요
select user_id, nickname, price total_price
from used_goods_user ugu, (SELECT writer_id, sum(price) price
    from used_goods_board
    where status = 'DONE'
    group by writer_id
    having sum(price) >= 700000) ugb
where ugu.user_id = ugb.writer_id
order by total_price