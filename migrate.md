�ָ����ݿ��ܽ᣺

	Ŀǰ�ָ�ķ�����û����ȫ�����������Լ�д�������ر��� lagou_position��Ĵ���


-- Ҳ���Էֲ����С�ʹ�� union �����Ȼ�����䣬��Ч�ʻ�Ƚϵ�
create table lagou_position as
select pid, cid as city, company_id as company, position, field, salary_min, salary_max, workyear, education, ptype, pnature, advantage, published_at, updated_at
from (select * from lagou_position_bk where district is null) p
  join lagou_city c on c.city like concat(p.city, '%') and c.district is null;

insert into lagou_position
select pid, cid as city, company_id as company, position, field, salary_min, salary_max, workyear, education, ptype, pnature, advantage, published_at, updated_at
from (select * from lagou_position_bk where district is not null) p
  join lagou_city c on c.city like concat(p.city, '%') and c.district like concat(p.district, '%');


���������Ŀǰ��û����⡣


���ڹ�˾��ı���ĵã�
1������ʡ���С��صĹ�ϵ ��.parentId=��.id ��ͬ�� ��.parentId=ʡ.id
2:�������������ʱ��ϸ�ĵĴ����Ĺ�ϵ����Ϊһ��ʼ��ʱ����������������ˣ������������е�ϸ�Ľ������������˱�Ĺ�ϵ�������Ѿ������Լ�д�����ˡ�
3��д����ȥ�ˣ�����ȥ��ĥ "����˾��������Ϣ����������ȥ"��	