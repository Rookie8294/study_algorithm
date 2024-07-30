-- 코드를 입력하세요
select apnt_no, pt_name, pati.pt_no, dt.mcdp_cd, dt.dr_name, apnt_ymd
from (SELECT *
    from appointment
    where mcdp_cd = 'CS' and
        apnt_cncl_yn = 'N' and
        to_char(apnt_ymd, 'yyyymmdd') = '20220413'
     ) appnt,
     patient pati,
     doctor dt
where appnt.pt_no = pati.pt_no and appnt.mddr_id = dt.dr_id
order by apnt_ymd