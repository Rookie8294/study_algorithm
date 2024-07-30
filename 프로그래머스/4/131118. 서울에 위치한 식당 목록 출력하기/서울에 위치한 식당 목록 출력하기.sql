-- 코드를 입력하세요
select ri.rest_id, rest_name, food_type, favorites, address, review_score
from (SELECT rest_id, round(avg(review_score),2) review_score
    from rest_review
    group by rest_id) re,
    rest_info ri
where re.rest_id = ri.rest_id and address like '서울%'
order by review_score desc, favorites desc
