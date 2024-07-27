-- 코드를 입력하세요

select category, count(*) as products
from ( SELECT substr(product_code, 1, 2) category
from product ) code
group by code.category
order by category
