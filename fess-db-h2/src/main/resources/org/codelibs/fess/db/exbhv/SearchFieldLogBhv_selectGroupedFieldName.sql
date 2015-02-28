-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
select
-- ELSE select count(*) from (select
/*END*/
  NAME as name
 from SEARCH_FIELD_LOG 
 group by NAME
/*IF pmb.isPaging()*/
 order by NAME desc
-- ELSE ) as tb1
/*END*/
