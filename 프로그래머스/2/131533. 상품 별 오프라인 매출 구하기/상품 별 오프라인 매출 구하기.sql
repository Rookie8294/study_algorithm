-- 코드를 입력하세요
SELECT p.product_code, p.price*os.sales_amount sales
from product p, (select product_id, sum(sales_amount) sales_amount from offline_sale group by product_id ) os
where p.product_id = os.product_id
order by sales desc, product_code asc 
