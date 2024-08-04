

select '/home/grep/src/' || ugb.board_id || '/' || file_id || file_name || file_ext file_path 
from used_goods_board ugb, used_goods_file ugf
where ugb.board_id = ugf.board_id and
    ugb.views = ( select max(views) from used_goods_board )
order by file_id desc
