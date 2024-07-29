-- 코드를 입력하세요
select food_type, rest_id, rest_name, favorites
from (select food_type, rest_id, rank() over(partition by food_type order by favorites desc) ranking, rest_name, favorites
from rest_info) rank
where ranking = 1
order by food_type desc