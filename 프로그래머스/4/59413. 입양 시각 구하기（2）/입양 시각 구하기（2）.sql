

select b.hour, nvl(count(a.animal_id), 0)
from animal_outs a,
    (select level - 1 hour from dual connect by level <= 24) b
where b.hour = to_number(to_char(a.datetime(+), 'hh24'))
group by b.hour
order by 1