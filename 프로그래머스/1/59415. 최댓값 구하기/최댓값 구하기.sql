-- 코드를 입력하세요
select datetime
from (SELECT *
from animal_ins
order by datetime desc)
where rownum = 1
;