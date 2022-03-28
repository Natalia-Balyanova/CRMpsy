create table clients
(
    id          bigserial primary key,
    name        varchar(30) not null,
    birthday    varchar(30) not null,
    email       varchar(255),
    phone       varchar(255),
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

create table orders
(
    id          bigserial primary key,
    client_id  bigint references clients (id),
    price       integer,
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

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

create table order_items
(
    id                bigserial primary key,
    order_id          bigint references orders (id),
    psychologies_id   bigint references psychologies (id),
    price             integer,
    created_at        timestamp default current_timestamp,
    updated_at        timestamp default current_timestamp
);

insert into psychologies (name, surname, birthday, email, school_method, problem_id)
values
('John', 'Malkovich', 1960, 'john@gmail.com', 'behavior', 1),
('John', 'Malkovich', 1960, 'john@gmail.com', 'behavior', 2),
('Max', 'Maxwell', 1985, 'maxn@gmail.com', 'psychoanalysis', 3);

insert into clients (name, birthday, email, phone)
values ('Bob', '01.01.1987', 'bob_1987@gmail.com', '1234567');

insert into orders (client_id, price)
values (1, 130);

insert into order_items (order_id, psychologies_id, price)
values (1, 1, 5000);