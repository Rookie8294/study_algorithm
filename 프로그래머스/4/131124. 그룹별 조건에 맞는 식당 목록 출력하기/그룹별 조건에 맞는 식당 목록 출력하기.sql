select member_name, review_text, to_char(review_date, 'yyyy-mm-dd') review_date
from member_profile mp, rest_review rr
where mp.member_id =
    (select member_id
    from (select member_id, count(*) cnt
        from rest_review
        group by member_id
        order by cnt desc, member_id)
    where rownum = 1)
    and
    rr.member_id = 
    (select member_id
    from (select member_id, count(*) cnt
        from rest_review
        group by member_id
        order by cnt desc, member_id)
    where rownum = 1)
order by review_date, review_text