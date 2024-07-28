
select '/home/grep/src/' || ugf.board_id || '/' || file_id || file_name || file_ext as file_path
from used_goods_file ugf, (select board_id, rank() over(order by views desc) ranking
from used_goods_board) ugb
where ugf.board_id = ugb.board_id and ugb.ranking = 1
order by file_id desc
