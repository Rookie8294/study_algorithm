-- 코드를 입력하세요
select name
from (SELECT name, rank() over(order by datetime) as rank
from animal_ins) ranking
where ranking.rank = 1
;