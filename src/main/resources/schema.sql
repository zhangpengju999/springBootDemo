create table if not exists users (
  id int unsigned AUTO_INCREMENT PRIMARY KEY,
  username varchar(64),
  email varchar(64)
);
