-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth, 'yyyy-mm-dd')
from member_profile
where tlno is not null and gender = 'W' and to_char(date_of_birth, 'mm') = '03'
order by member_id