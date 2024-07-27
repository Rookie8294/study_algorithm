-- 코드를 입력하세요
select hh.h hour, count(*) count
from (select to_number(to_char(datetime, 'hh24')) h
from animal_outs
) hh
group by hh.h
having hh.h between 9 and 19
order by hour

