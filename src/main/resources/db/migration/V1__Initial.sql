CREATE TABLE IF NOT EXISTS `car` (

    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(20),
    `type` varchar(20),
    `create_at` timestamp

)ENGINE=InnoDB DEFAULT CHARSET=UTF8;