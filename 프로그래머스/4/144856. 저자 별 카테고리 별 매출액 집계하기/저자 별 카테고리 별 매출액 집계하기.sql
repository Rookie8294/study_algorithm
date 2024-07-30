
select a.author_id, a.author_name, category,
    sum(bs.sales * b.price) total_price
from book b, author a, book_sales bs
where to_char(bs.sales_date, 'yyyymm') = '202201'
    and b.author_id = a.author_id
    and b.book_id = bs.book_id
group by a.author_id, a.author_name, category
order by author_id, category desc