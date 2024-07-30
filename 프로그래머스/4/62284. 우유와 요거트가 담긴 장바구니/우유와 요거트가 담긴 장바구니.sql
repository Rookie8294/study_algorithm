-- 코드를 입력하세요
select cart_id
from( SELECT cart_id, listagg(name, ' ') within group(order by name) names
from cart_products
group by cart_id )
where names like '%Yogurt%' and names like '%Milk%'
order by cart_id

