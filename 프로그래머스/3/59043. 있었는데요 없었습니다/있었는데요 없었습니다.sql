-- 코드를 입력하세요
SELECT ai.animal_id, ai.name
from animal_ins ai, animal_outs ao
where ai.animal_id = ao.animal_id and ai.datetime > ao.datetime
order by ai.datetime