-- 코드를 입력하세요
SELECT car_id, round( (sum(end_date - start_date)+count(car_id)) / count(car_id),1) as average_duration
from car_rental_company_rental_history
group by car_id
having round( (sum(end_date - start_date) + count(car_id)) / count(car_id),1) >= 7
order by average_duration desc, car_id desc
