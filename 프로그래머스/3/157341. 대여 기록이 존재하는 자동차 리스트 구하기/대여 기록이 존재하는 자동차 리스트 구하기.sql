-- 코드를 입력하세요
SELECT distinct car_rental_company_car.car_id car_id
from car_rental_company_car inner join car_rental_company_rental_history
    on car_rental_company_car.car_id = car_rental_company_rental_history.car_id
where car_type = '세단' and 
    to_char(car_rental_company_rental_history.start_date, 'mm') = '10'
order by car_id desc
