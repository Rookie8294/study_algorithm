-- 코드를 입력하세요
select ai.name, ai.datetime
from (SELECT ai.animal_id, ai.datetime, rank() over(order by ai.datetime) ranking
    from animal_ins ai, animal_outs ao
    where ai.animal_id = ao.animal_id(+) and ao.animal_id is null) filter,
    animal_ins ai
where filter.animal_id=ai.animal_id and filter.ranking between 1 and 3
order by datetime


