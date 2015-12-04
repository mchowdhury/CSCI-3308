CREATE DATABASE IF NOT EXISTS rewards;
use rewards;

create table if not exists items
(id int(3),
reward varchar(12),
primary key (id)
);
CREATE table if not exists costs
(id int(3),
cost int(4),
primary key (id),
foreign key (id) references items(id)
);
insert into items values (1,"VCS BOGO");
insert into costs values (1,500);
insert into items values (2,"QDOBA BOGO");
insert into costs values (2,1000);
insert into items values (3,"OZOS 50%");
insert into costs values (3,375);
insert into items values (4,"IHOP 10%");
insert into costs values (4,500);

