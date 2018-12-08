

-- insert role
insert into role(name) values('productUpload');
insert into role(name) values('productDelete');
insert into role(name) values('productUpdate');
insert into role(name) values('productRead');
insert into role(name) values('boardWrite');
insert into role(name) values('boardDelete');
insert into role(name) values('boardUpdate');
insert into role(name) values('boardRead');
insert into role(name) values('ADMIN');
insert into role(name) values('USER');


-- insert ranking
insert into ranking(name,sale_money,sale_ratio) values ('bronze',1000,0.1);
insert into ranking(name,sale_money,sale_ratio) values ('silver',2000,0.15);
insert into ranking(name,sale_money,sale_ratio) values ('gold',3000,0.2);


-- insert member
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('koola977','Choi',1,'koola@gmail.com','121231','Thresh','Newyork','12345','010-9923-3293',1220,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('koola','park',2,'koo@gmail.com','1231231314','Thresh','seoul','12345','010-9923-1234',12310,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('koola123','Kim',3,'kla@gmail.com','12313131314','Ari','tokyo','12345','010-9923-1211',13120,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('ilove503','Park',1,'sunsil@nate.com','1231114','아임쓰레기','tokyo','12345','010-9911-1211',0,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('ilovekimchi','Paul',3,'paul@naver.com','123211334','mrPaul','Otawa','01231','010-1231-1211',500000,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('ihatechina','brucelee',3,'lee@china.com','qwe23r1234','mrlee','beijing','44212','010-1231-1211',50000,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('iliveinseoul','sunsil',1,'sunsil2@daum.net','qw23er121234','garbage112','newyork','01212','010-1341-1211',10000,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('sehwacjy','cjy',3,'sehwacjy@empal.com','qwerqw23er234','jdragon','kamloops','02212','010-1341-1211',690000,now(),now());
insert into member(id,username,ranking_id,email,password,nickname,addr,zip_code,phone,miliage,reg_date,mod_date)
  values('googler','cjy',3,'koola1@gmail.com','{bcrypt}$2a$10$E8iPy5Bz0FC3ro9bmUfx3uVoXdLw4lQnYB4UndyzO751NZqZULpOe','jdragon','kamloops','02212','010-1341-1211',690000,now(),now());


-- insert member_role
insert into member_role(member_id, role_id) values('koola977',1);
insert into member_role(member_id, role_id) values('koola977',2);
insert into member_role(member_id, role_id) values('koola977',3);
insert into member_role(member_id, role_id) values('ilove503',8);
insert into member_role(member_id, role_id) values('koola',5);
insert into member_role(member_id, role_id) values('koola',8);
insert into member_role(member_id, role_id) values('koola123',8);
insert into member_role(member_id, role_id) values('ilovekimchi',8);
insert into member_role(member_id, role_id) values('ihatechina',8);
insert into member_role(member_id, role_id) values('iliveinseoul',8);
insert into member_role(member_id, role_id) values('sehwacjy',8);
insert into member_role(member_id, role_id) values('sehwacjy',9);
insert into member_role(member_id, role_id) values('googler',5);
insert into member_role(member_id, role_id) values('googler',6);
insert into member_role(member_id, role_id) values('googler',7);
insert into member_role(member_id, role_id) values('googler',8);
insert into member_role(member_id, role_id) values('googler',10);

-- insert order_status
insert into order_status(name) values('결제대기');
insert into order_status(name) values('배송대기');
insert into order_status(name) values('배송중');
insert into order_status(name) values('니네집문앞');
insert into order_status(name) values('주문완료');

-- insert shipping_info
insert into shipping_info(addr,memo,phone,shipping_fee,user_name,zip_code)
 values('서울','늦으면 벌금','010-2222-2212',3000,'Choi',12345);
 insert into shipping_info(addr,memo,phone,shipping_fee,user_name,zip_code)
 values('부산','늦으면 벌금','010-3332-2212',5000,'Kim',12232);


-- insert orderinfo
-- total_price...  상품 테이블 조회해서 해당 상품의 가격을 다 더한 후에 인서트 해줘야한다.
insert into order_info(order_date, total_price, member_id, order_status_id, shipping_info_id)
 values(now() , 30000, 'koola977',1,1);
insert into order_info(order_date, total_price, member_id, order_status_id, shipping_info_id)
 values(now() , 50000, 'koola',4,2);



-- insert expireType
insert into expireType(name) values('fixedDate');
insert into expireType(name) values('nonFixedDate');

-- insert coupon
insert into coupon(cur_qty, total_qty, name, sale_money, sale_ratio,description, duration_period, expiretype_id)
 values(1,1,'가입시주는쿠폰(30일짜리)',1000,0,'회원가입시 줍니다.',30,2);
insert into coupon(cur_qty, total_qty, name, sale_money, sale_ratio,description, expire_date ,expiretype_id)
 values(500,500,'이벤트쿠폰(19년말일까지사용)',3000,0,'이벤트쿠폰입니다.','2018-12-31 23:59:59',1);

-- insert member_coupon  orderInfo id가 필요-->
-- 기간 쿠폰의 경우 regdate + duration이 expire_date가 되어야 한다.-->
-- 쿠폰만료일이 고정된 쿠폰의 경우엔 쿠폰의 expire_date 를 아래에 넣어주면 된다.-->
-- insert into member_coupon(reg_date, expire_date, use_check , coupon_id, member_id)
--  values(now(), date_add(now(),interval +30 day), 0, 1 , 'koola977');
insert into member_coupon(reg_date, expire_date, use_check , coupon_id, member_id)
 values(now(), now(), 0, 1 , 'koola977');
insert into member_coupon(reg_date, expire_date, use_check , coupon_id, member_id)
 values(now(), '2018-12-31 23:59:59', 0, 2 , 'koola977');



-- insert category
insert into category(name) values('작은스티커');
insert into category(name) values('중간스티커');
insert into category(name) values('큰스티커');

-- insert product
insert into product(name,price,mileage,total_qty,cur_qty)
 values('구글스티커', 30000,300, 200,200);
insert into product(name,price,mileage,total_qty,cur_qty)
 values('애플스티커', 50000, 500, 200,200);
 insert into product(name,price,mileage,total_qty,cur_qty)
 values('삼성스티커', 10000, 100, 200,200);

 -- insert product_category
 insert into product_category(product_id, category_id) values(1,1);
 insert into product_category(product_id, category_id) values(1,2);
 insert into product_category(product_id, category_id) values(2,2);
 insert into product_category(product_id, category_id) values(2,3);
 insert into product_category(product_id, category_id) values(3,3);

 -- insert image
 insert into image(original_name, path, reg_date, saved_name, size, type, product_id)
  values('image1' , '18/11/16/',now(),'image1',51231,'jpg',1);
  insert into image(original_name, path, reg_date, saved_name, size, type, product_id)
  values('image2' , '18/11/16/',now(),'image1',51231,'jpg',1);
  insert into image(original_name, path, reg_date, saved_name, size, type, product_id)
  values('image1' , '18/11/16/',now(),'image1',51231,'jpg',2);
  insert into image(original_name, path, reg_date, saved_name, size, type, product_id)
  values('image1' , '18/11/16/',now(),'image1',51231,'jpg',3);



-- insert orderinfo_product
insert into order_info_product(order_info_id,product_id,mileage, name, price,quantity)
 values(1,1,300,'구글스티커',30000,1);
insert into order_info_product(order_info_id,product_id,mileage, name, price,quantity)
 values(1,2,500,'애플스티커',50000,1);


-- insert cart_product
insert into cart_product(member_id,product_id,quantity) values('koola977',1,1);
insert into cart_product(member_id,product_id,quantity) values('koola977',2,2);
insert into cart_product(member_id,product_id,quantity) values('koola977',3,1);

--insert into member_product  (찜하기)
insert into member_product(member_id, product_id) values('koola977',1);
insert into member_product(member_id, product_id) values('koola977',2);
insert into member_product(member_id, product_id) values('koola',3);
insert into member_product(member_id, product_id) values('koola12',1);