CREATE SCHEMA IF NOT EXISTS `web_db`;

CREATE TABLE IF NOT EXISTS `web_db`.`users` (
  `user_id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(12) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(256) NOT NULL,
  `enabled` TINYINT NOT NULL DEFAULT 0,
  `withdrawn` TINYINT NOT NULL DEFAULT 0,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)
);

