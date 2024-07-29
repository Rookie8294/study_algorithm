-- 코드를 입력하세요
SELECT category, sum(sales) total_sales
from book b, book_sales bs
where b.book_id = bs.book_id and to_char(bs.sales_date,'yyyymm') = '202201'
group by category
order by category