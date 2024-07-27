select filter.mcdp_cd 진료과코드, count(*) "5월예약건수"
from    (select *
        from appointment
        where to_char(apnt_ymd, 'yyyy-mm') = '2022-05'
         ) filter
group by filter.mcdp_cd
order by "5월예약건수", 진료과코드
