select * from users;
insert into users(name,surname,email)
values('admin','admin','admin@gmail.com'),
      ('user','user','user@gmail.com');


select * from roles;
insert into roles (role)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

select * from user_roles;
insert into user_roles(user_id,roles_id)
values (2,1),
       (1,2);

