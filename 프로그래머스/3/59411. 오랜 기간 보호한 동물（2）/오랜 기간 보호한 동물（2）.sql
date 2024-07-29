
select animal_id, name
from (select ai.animal_id, ai.name, rank() over(order by to_number(to_char(ao.datetime, 'yyyymmdd')) - to_number(to_char(ai.datetime, 'yyyymmdd')) desc) ranking
from animal_ins ai, animal_outs ao
where ai.animal_id = ao.animal_id)
where ranking between 1 and 2
order by ranking
