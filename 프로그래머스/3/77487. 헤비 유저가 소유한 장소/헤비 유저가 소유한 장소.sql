-- 코드를 입력하세요
select id, name, result.host_id
from (SELECT host_id
from places
group by host_id
having count(*) >= 2) result, places p
where result.host_id = p.host_id
order by id