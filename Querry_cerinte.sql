INSERT INTO `tema3`.`customers`
(`id`,`username`,`last_name`,`first_name`,`phone`,`address`,`city`,`postalCode`,`country`)
VALUES
(5,"DanStuparu","Stuparu","Dan","0729759123","Str. Unirii, Craiova,Dolj","Craiova","149297","Romania");

INSERT INTO `tema3`.`orders`
(`id`,
`order_date`,
`shipped_date`,
`status`,
`customers_id`)
VALUES
(5,"2022-07-19","2022-07-27","on the way",5);

INSERT INTO `tema3`.`products`
(`code`,
`name`,
`description`,
`stock`,
`price`)
VALUES
("1243","gloves","deerskin leather", "9","120");

INSERT INTO orderdetails
(`id`,`order_date`,`shipped_date`,`status`,`comments`,`customer_id`)
VALUES
(3,"2022-03-05","2022-05-12","waiting","nothing",3);

INSERT INTO payments
(`customer_id`,`payment_date`,`amount`)
VALUES
(1,"2019-10-20",172.10);



-- Updating the status of one order, for example order no.2:
UPDATE `tema3`.`orders`
SET `status` = "on the way"
WHERE `id` = 2;
select * from orders;

-- adding comments to the above order:
UPDATE orders
SET `comments` = "new order from homework"
WHERE id = 5;

-- selecting/viewing 3rd customer's orders:
SELECT * from orders
WHERE `customers_id` = 3;

-- updating the stock when placing an order:
INSERT INTO `tema3`.`orders`
(`id`,
`order_date`,
`shipped_date`,
`status`,
`customers_id`)
VALUES
(5,"2022-07-19","2022-07-27","on the way",5);

-- updating the stock for gunholsters after selling 5 pieces to customer #5
INSERT INTO `tema3`.`orders`
(`id`,
`order_date`,
`shipped_date`,
`status`,
`customers_id`)
VALUES
(6,"2022-07-25","2022-07-27","on the way",5);
-- gunholsters: 5 pieces ($130 each)
INSERT INTO orderdetails
(`quantity`,`priceEach`,`product_code`,`id`)
VALUES 
(5,130,"1242",6);
-- updating the stock for the sold product (- 5 pieces)
UPDATE products
SET stock = stock - 5
WHERE code = "1242";

select*from customers;
select*from orders;
select*from products;
select*from orderdetails;
select*from payments;







