-- 코드를 입력하세요
SELECT ii.ingredient_type, sum(fh.total_order)
from first_half fh, icecream_info ii
where fh.flavor = ii.flavor
group by ingredient_type
;