CREATE TABLE IF NOT EXISTS  blog
(
    id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR(500)  NOT NULL,
    content VARCHAR(5000) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

 CREATE TABLE IF NOT EXISTS  user_info
 (
     id       INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     username VARCHAR(50)  NOT NULL,
     password VARCHAR(500) NOT NULL,
     fullname VARCHAR(50)  NOT NULL
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8;
