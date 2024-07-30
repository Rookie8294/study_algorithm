select flavor
from (select flavor, rank() over( order by sum(total_order) desc ) ranking
    from (select flavor, sum(total_order) total_order
        from first_half
        group by flavor
        union
        select flavor, sum(total_order) total_order
        from july
        group by flavor)
    group by flavor)
where ranking between 1 and 3 
    