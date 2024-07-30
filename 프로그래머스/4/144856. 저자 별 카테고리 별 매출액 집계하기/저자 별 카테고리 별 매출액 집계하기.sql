-- 코드를 입력하세요
select a.author_id, author_name, category, sum(total_sales)
from(select bs.book_id, category, author_id, sales * price total_sales
from (SELECT book_id, sum(sales) sales
    from book_sales
    where to_char(sales_date, 'yyyymm') = '202201'
    group by book_id ) bs,
    book b
where bs.book_id=b.book_id) b,
author a
where b.author_id = a.author_id
group by a.author_id, author_name, category
order by author_id, category desc
