-- 코드를 입력하세요
select ao.animal_id, animal_type, name
from (SELECT animal_id
    from animal_ins
    where sex_upon_intake like 'Intact%') intact,
    animal_outs ao
where intact.animal_id = ao.animal_id and ao.sex_upon_outcome not like 'Intact%'
order by animal_id