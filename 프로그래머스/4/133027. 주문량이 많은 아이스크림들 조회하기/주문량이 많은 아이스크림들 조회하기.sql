
select flavor
from(select half.flavor, sum(half.total_order + j.total_order) total_order
from first_half half,
    july j
where half.flavor = j.flavor
group by half.flavor
order by total_order desc)
where rownum between 1 and 3
