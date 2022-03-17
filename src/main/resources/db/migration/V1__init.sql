create table problems (
    id              bigserial primary key,
    title           varchar(255),
    created_at      timestamp default current_timestamp,
    updated_at      timestamp default current_timestamp
);

insert into problems (title)
values
('OKR'),
('Suicide'),
('Depression');

create table psychologies (
  id            bigserial primary key,
  name          varchar(255),
  surname       varchar(255),
  birthday      int not null,
  email         varchar(255),
  school_method varchar(255),
  problem_id   bigint references problems (id),
  created_at    timestamp default current_timestamp,
  updated_at    timestamp default current_timestamp
);

insert into psychologies (name, surname, birthday, email, school_method, problem_id)
values
('John', 'Malkovich', 1960, 'john@gmail.com', 'behavior', 1),
('John', 'Malkovich', 1960, 'john@gmail.com', 'behavior', 2),
('Max', 'Maxwell', 1985, 'maxn@gmail.com', 'psychoanalysis', 3);


--create table orders
--(
--    id           bigserial primary key,
--    username     varchar(255) not null,
--    name         varchar(255),
--    surname      varchar(255),
--    total_price  numeric(8, 2)  not null,
--    order_status varchar(255)  not null,
--    address      varchar(255),
--    street       varchar(255),
--    phone        varchar(255),
--    house        varchar(255),
--    flat         varchar(255),
--    city         varchar(255),
--    postal_code  varchar(255),
--    country_code varchar(255),
--    district     varchar(255),
--    created_at   timestamp default current_timestamp,
--    updated_at   timestamp default current_timestamp
--);
--
--create table order_items
--(
--    id                bigserial primary key,
--    product_id        bigint not null references products (id),
--    order_id          bigint not null references orders (id),
--    quantity          int    not null,
--    price_per_product numeric(8, 2)    not null,
--    price             numeric(8, 2)    not null,
--    created_at        timestamp default current_timestamp,
--    updated_at        timestamp default current_timestamp
--);
--
--insert into orders (username, total_price, address, phone, name, surname, order_status, city, street, house, flat, postal_code, country_code, district)
--values ('john', 199.98, 'address', '12345', 'john', 'malcovich', '1', 'moscow', 'nahimovskiy', '61', '70', '193232', 'RUS', 'Moscow');
--
--insert into order_items (product_id, order_id, quantity, price_per_product, price)
--values (1, 1, 2, 99.99, 199.98);