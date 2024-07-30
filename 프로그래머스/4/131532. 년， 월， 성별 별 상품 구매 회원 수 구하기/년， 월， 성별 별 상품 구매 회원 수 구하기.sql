select year, ltrim(month, 0), gender, count(ui.user_id)
from (select *
    from (select to_char(sales_date, 'yyyy') year, to_char(sales_date, 'mm') month,
    user_id
    from online_sale)
    group by year, month, user_id) filter,
    user_info ui
where ui.user_id = filter.user_id and gender is not null
group by year, month, gender
order by year, month, gender
