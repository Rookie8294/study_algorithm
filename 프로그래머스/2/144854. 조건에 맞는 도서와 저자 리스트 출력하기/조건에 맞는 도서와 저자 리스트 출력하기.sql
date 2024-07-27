-- 코드를 입력하세요
SELECT book_id, a.author_name, to_char(published_date, 'yyyy-mm-dd')
from book b, author a
where b.author_id = a.author_id and category = '경제'
order by published_date
