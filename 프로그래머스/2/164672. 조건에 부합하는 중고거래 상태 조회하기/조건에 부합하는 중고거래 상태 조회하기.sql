-- 코드를 입력하세요
SELECT board_id, writer_id, title, price,
    case when status = 'SALE' then '판매중'
         when status = 'RESERVED' then '예약중'
         when status = 'DONE' then '거래완료'
         end
from used_goods_board
where to_char(created_date, 'yyyy-mm-dd') = '2022-10-05'
order by board_id desc