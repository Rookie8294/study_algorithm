-- 코드를 입력하세요
select pr.price_range price_group, count(*)
from(SELECT product_id, product_code, price,
    case when price < 10000 then 0
    else floor(price/10000)*10000 end price_range
from product) pr
group by pr.price_range
order by price_group