-- 코드를 입력하세요
SELECT ugb.title board_title, ugb.board_id, ugr.reply_id, ugr.writer_id, ugr.contents, to_char(ugr.created_date, 'yyyy-mm-dd') reply_created_date
from used_goods_board ugb, used_goods_reply ugr
where ugb.board_id = ugr.board_id and to_char(ugb.created_date, 'yyyy-mm') = '2022-10'
order by reply_created_date, board_title