-- 코드를 입력하세요
select fp.product_id, fp.product_name, sum(price * amount) total_sales
from food_product fp, food_order fo
where fp.product_id = fo.product_id and to_char(produce_date, 'yyyymm') = '202205'
group by fp.product_id, fp.product_name
order by total_sales desc, product_id