-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema sistemadevenda
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sistemadevenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistemadevenda` DEFAULT CHARACTER SET utf8 ;
USE `sistemadevenda` ;

-- -----------------------------------------------------
-- Table `sistemadevenda`.`funcionário`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemadevenda`.`funcionário` (
  `código` INT(11) NOT NULL,
  `ativo` VARCHAR(3) NOT NULL,
  `nome` VARCHAR(50) NOT NULL,
  `endereço` VARCHAR(50) NOT NULL,
  `telefone` VARCHAR(50) NULL DEFAULT NULL,
  `celular` VARCHAR(15) NULL DEFAULT NULL,
  `email` VARCHAR(50) NULL DEFAULT NULL,
  `cargo` VARCHAR(20) NOT NULL,
  `salário` DOUBLE NOT NULL,
  `senha` VARCHAR(50) NOT NULL,
  `observações` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`código`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sistemadevenda`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemadevenda`.`produto` (
  `código` INT(11) NOT NULL AUTO_INCREMENT,
  `ativo` VARCHAR(3) NOT NULL,
  `descritivo` VARCHAR(50) NOT NULL,
  `valor_aquisição` DOUBLE NOT NULL,
  `preço_venda` DOUBLE NOT NULL,
  `unidade_medida` VARCHAR(4) NOT NULL,
  `qtd_mínima` FLOAT NOT NULL,
  `saldo_atual` FLOAT NOT NULL,
  PRIMARY KEY (`código`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
