-- 코드를 입력하세요
SELECT to_number(to_char(start_date, 'mm')) month, car_id, count(*)
from car_Rental_company_rental_history
where car_id in ( select car_id from car_rental_company_rental_history
                where to_char(start_date, 'yyyy-mm') between '2022-08'and '2022-10'
                group by car_id
                having count(*) >= 5)
            and to_char(start_date, 'yyyy-mm') between '2022-08' and '2022-10'
group by to_char(start_date, 'mm'), car_id
having count(*) != 0
order by month, car_id desc