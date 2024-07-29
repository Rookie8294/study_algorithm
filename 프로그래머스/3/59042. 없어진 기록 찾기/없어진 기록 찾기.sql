-- 코드를 입력하세요
SELECT ao.animal_id, ao.name
from animal_ins ai, animal_outs ao
where ai.animal_id(+) = ao.animal_id and ai.animal_id is null
order by ao.animal_id